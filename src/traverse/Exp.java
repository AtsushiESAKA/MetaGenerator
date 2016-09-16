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
	
	public static Exp decorate(Node node) {
		
		Exp exp = null;
		
		if (node instanceof ClassNode) {
		} else if (node instanceof MethodNode) {
			
		} else if (node instanceof FieldNode) {
			
		} else if (node instanceof ParameterNode) {
			
		}		
		
		return exp;
	}
}
