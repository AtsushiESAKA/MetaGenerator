import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import model.ClassNode;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class DocumentAccepter {
	Document doc;
	ClassNode[] nodelist;
	int classLength;
	NodeChecker checker;

	DocumentAccepter() {
		nodelist = new ClassNode[10000];
		classLength = 0;
		checker = new NodeChecker();
	}

	void readXMI() throws SAXException, IOException,
			ParserConfigurationException {
		File file = new File("src/test.xmi");
		Document document = DocumentBuilderFactory.newInstance()
				.newDocumentBuilder().parse(file);
		this.doc = document;
		for (int i = 0; i < this.doc.getChildNodes().item(0).getChildNodes()
				.getLength(); i++) {
			Node n = this.doc.getChildNodes().item(0).getChildNodes().item(i);
			if (n.getNodeName().equals("uml:Model")) {
				for (int x = 3; x < n.getChildNodes().getLength(); x++) {
					if (!n.getChildNodes().item(x).getNodeName()
							.equals("#text"))
						tree(n.getChildNodes().item(x));

				}
			}
		}
	}
	void tree(Node node) {
		if (node.hasAttributes()) {
			checker.nodeCheck(node,nodelist,classLength);
		}
		if (node.hasChildNodes()) {
			for (int x = 0; x < node.getChildNodes().getLength(); x++) {
				tree(node.getChildNodes().item(x));
			}
		}
	}

}
