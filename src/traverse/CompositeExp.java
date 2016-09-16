package traverse;

import model.AbstractNode;
import java.util.List;

public abstract class CompositeExp extends Exp{
	
	public CompositeExp(AbstractNode contents) {
		super(contents);
	}

	private List<Exp> children;

	public List<Exp> getChildren() {
		return children;
	}

	public void setChildren(List<Exp> children) {
		this.children = children;
	}
	
	public void addChild(Exp exp) {
		if (children != null) {
			children.add(exp);
		}
	}

}
