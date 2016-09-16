package traverse;

import model.Node;

public abstract class CompositeExp extends Exp{
	
	public CompositeExp(Node contents) {
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
