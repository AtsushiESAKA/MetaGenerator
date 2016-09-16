package model;

import java.util.List;

public abstract class CompositeNode extends AbstractNode{
	
	private List<AbstractNode> children;

	public List<AbstractNode> getChildren() {
		return children;
	}

	public void setChildren(List<AbstractNode> children) {
		this.children = children;
	}
	
	public void addChild(AbstractNode child) {
		this.children.add(child);
	}

}
