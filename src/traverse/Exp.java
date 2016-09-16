package traverse;

import model.ClassNode;
import model.FieldNode;
import model.MethodNode;
import model.Node;
import model.ParameterNode;

public abstract class Exp extends Node implements Interpreter{
	
	private Node contents;
	
	public Exp(Node contents) {
		this.contents = contents;
	}

	protected Node getContents() {
		return contents;
	}
	
	/**
	 * TODO Expがすべてのサブクラスについて知っていないといけないので、美しくない
	 * @param node
	 * @return
	 */
	public static Exp decorate(Node node) {
		
		Exp exp = null;
		
		if (node instanceof ClassNode) {
			exp = new ClassExp(node);
			for(Node n : ((ClassNode) node).getChildren()) {
				((ClassExp)exp).addChild(Exp.decorate(n));
			}
		} else if (node instanceof MethodNode) {
			exp = new MethodExp(node);
			for(Node n : ((MethodNode) node).getChildren()) {
				((MethodExp)exp).addChild(Exp.decorate(n));
			}
		} else if (node instanceof FieldNode) {
			exp = new FieldExp(node);			
		} else if (node instanceof ParameterNode) {
			exp = new ParameterExp(node);
		}		
		
		return exp;
	}
}
