package traverse;

import model.AbstractNode;

public abstract class CompositeExp extends Exp{
	
	public CompositeExp(AbstractNode contents) {
		super(contents);
	}

	private Exp children;

	public Exp getChildren() {
		return children;
	}

	public void setChildren(Exp children) {
		this.children = children;
	}

}
