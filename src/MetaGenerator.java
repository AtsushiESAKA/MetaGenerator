import model.Node;
import transform.TransformIAD;
import transform.TransformIAD_Java;
import traverse.Exp;


public class MetaGenerator {

	public static void main(String[] args) {
		
		Node xmi = createXMITree();
		Exp exp = Exp.decorate(xmi);
		TransformIAD iad = new TransformIAD_Java();
		
		exp.interpreted(iad);
		
	}

	private static Node createXMITree() {
		return null;
	}

}
