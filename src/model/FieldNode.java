package model;

import java.util.HashMap;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class FieldNode extends PrimitiveNode{
	Node node;

	public FieldNode(Node node){
		this.node = node;
		NamedNodeMap map = node.getAttributes();
		HashMap hmap= new HashMap(); 
		for(int i = 0 ; i<map.getLength();i++){
			hmap.put(map.item(i).getNodeName(),map.item(i).getNodeValue());
		}
	
		System.out.println("field : " + hmap.get("name"));
	}
}
