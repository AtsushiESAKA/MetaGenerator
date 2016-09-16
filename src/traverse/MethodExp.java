package traverse;

import transform.TransformIAD;
import model.MethodNode;
import model.Node;

public class MethodExp extends CompositeExp{

	public MethodExp(Node contents) {
		super(contents);
	}

	@Override
	public void interpreted(TransformIAD iad) {
		iad.methodInterpretedBegin((MethodNode)this.getContents());
		
		for(Exp c : this.getChildren()) {
			c.interpreted(iad);
		}
		
		iad.methodInterpretedEnd((MethodNode)this.getContents());
	}

}
