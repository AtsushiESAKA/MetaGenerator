import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import model.AbstractNode;
import transform.TransformIAD;
import transform.TransformIAD_Java;


public class MetaGenerator {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		
//		AbstractNode[] xmi = createXMITree();

		createXMITree();
//		TransformIAD iad = new TransformIAD_Java();
		
		
		
		
		
	}

	private static AbstractNode[] createXMITree() throws SAXException, IOException, ParserConfigurationException {
		DocumentAccepter da = new DocumentAccepter();
		da.readXMI();
		return null;
	}

}
