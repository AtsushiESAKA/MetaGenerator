package model;

public abstract class CompositeNode extends AbstractNode{
	
	private AbstractNode children;

	public AbstractNode getChildren() {
		return children;
	}

	public void setChildren(AbstractNode children) {
		this.children = children;
	}

}
