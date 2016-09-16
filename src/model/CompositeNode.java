package model;

import java.util.List;

public abstract class CompositeNode extends Node{
	
	private List<Node> children;

	public List<Node> getChildren() {
		return children;
	}

	public void setChildren(List<Node> children) {
		this.children = children;
	}
	
	public void addChild(Node child) {
		this.children.add(child);
	}

}
