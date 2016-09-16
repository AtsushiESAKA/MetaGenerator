package model;

import java.util.HashMap;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class ClassNode extends CompositeNode{

	public PrimitiveNode[] pns;
	public MethodNode[] mns;
	Node node;
	public int pnLen;
	public int mnLen;
	
	public ClassNode(Node node){
		this.node = node;
		pns = new PrimitiveNode[10];
		mns = new MethodNode[10];
		pnLen = 0;
		mnLen = 0;
		NamedNodeMap map = node.getAttributes();
		HashMap hmap= new HashMap(); 
		for(int i = 0 ; i<map.getLength();i++){
			hmap.put(map.item(i).getNodeName(),map.item(i).getNodeValue());
		}
	
		System.out.println("class : " + hmap.get("name"));

	}

	public void setChildren(MethodNode mnode) {
		mns[mnLen] = mnode;
		mnLen++;
	}
}
