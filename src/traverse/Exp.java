package traverse;

import model.ClassNode;
import model.FieldNode;
import model.MethodNode;
import model.AbstractNode;
import model.ParameterNode;

public abstract class Exp extends AbstractNode implements Interpreter{
	
	private AbstractNode contents;
	
	public Exp(AbstractNode contents) {
		this.contents = contents;
	}

	protected AbstractNode getContents() {
		return contents;
	}
	
	/**
	 * TODO Expがすべてのサブクラスについて知っていないといけないので、美しくない
	 * @param node
	 * @return
	 */
	public static Exp decorate(AbstractNode node) {
		
		Exp exp = null;
		
		if (node instanceof ClassNode) {
			exp = new ClassExp(node);
			for(AbstractNode n : ((ClassNode) node).getChildren()) {
				((ClassExp)exp).addChild(Exp.decorate(n));
			}
		} else if (node instanceof MethodNode) {
			exp = new MethodExp(node);
			for(AbstractNode n : ((MethodNode) node).getChildren()) {
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
