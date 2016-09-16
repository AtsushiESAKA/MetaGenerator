package traverse;

import transform.TransformIAD;
import model.Node;
import model.ParameterNode;

public class ParameterExp extends PrimitiveExp{

	public ParameterExp(Node contents) {
		super(contents);
	}

	@Override
	public void interpreted(TransformIAD iad) {
		iad.parameterInterpretedBegin((ParameterNode)this.getContents());
		iad.parameterInterpretedEnd((ParameterNode)this.getContents());
	}

}
