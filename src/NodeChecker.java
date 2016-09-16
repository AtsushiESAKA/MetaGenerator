import java.util.HashMap;

import model.*;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;


public class NodeChecker {
	

	
	void nodeCheck(Node node,ClassNode[] nodes,int length){
		NamedNodeMap nodelist = node.getAttributes();
		switch(nodelist.getNamedItem("xmi:type").getNodeValue()){
		case "uml:Class":
			ClassNode cn = new ClassNode(node);
			nodes[length] = cn;
		break;
		case "uml:Property":
			if(nodeCheck("association",node)){
				FieldNode fn = new FieldNode(node);
				nodes[length].pns[nodes[length].pnLen] = fn;
				nodes[length].pnLen ++;
								
			}
		break;
		case "uml:Operation":
			MethodNode mn = new MethodNode(node);
			nodes[length].setChildren(mn);

		break;
		case "uml:Parameter":
			if(nodeCheck("direction",node)){
				ParameterNode pn = new ParameterNode(node);
//			System.out.println(nodes[length].mnLen);
//				nodes[length].mns[nodes[length].mnLen].setChildren(pn);
			}
		break;
		}
		
	}
	boolean nodeCheck(String key,Node anode){
		NamedNodeMap map = anode.getAttributes();
		HashMap<String,String> hmap = new HashMap<String, String>();
		for(int i = 0 ; i<map.getLength();i++){
			hmap.put(map.item(i).getNodeName(),map.item(i).getNodeValue());
		}
		if(hmap.containsKey(key)){
			return false;
		}
	return true;
	}
}
