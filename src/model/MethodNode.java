package model;

import java.util.HashMap;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class MethodNode extends CompositeNode{

	Node node;
	public ParameterNode[] pns;
	public int pnsLen;
	public MethodNode(Node node){
		this.node = node;
		pns = new ParameterNode[10];
		pnsLen =0;
		NamedNodeMap map = node.getAttributes();
		HashMap hmap= new HashMap(); 
		for(int i = 0 ; i<map.getLength();i++){
			hmap.put(map.item(i).getNodeName(),map.item(i).getNodeValue());
		}
	
		System.out.println("method : " + hmap.get("name"));
	}
	
	public void setChildren(AbstractNode pnode) {
		this.pns[pnsLen] = (ParameterNode) pnode;
		this.pnsLen++;
	}
}
