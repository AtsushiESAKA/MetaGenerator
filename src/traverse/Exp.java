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
	
	public static Exp decorate(AbstractNode node) {
		
		Exp exp = null;
		
		if (node instanceof ClassNode) {
		} else if (node instanceof MethodNode) {
			
		} else if (node instanceof FieldNode) {
			
		} else if (node instanceof ParameterNode) {
			
		}		
		
		return exp;
	}
}
