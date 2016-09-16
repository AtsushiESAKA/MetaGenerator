package model;

public abstract class CompositeNode extends Node{
	
	private Node children;

	public Node getChildren() {
		return children;
	}

	public void setChildren(Node children) {
		this.children = children;
	}

}
