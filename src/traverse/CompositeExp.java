package traverse;

import java.util.List;

import model.Node;

public abstract class CompositeExp extends Exp{
	
	public CompositeExp(Node contents) {
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
