package traverse;

import model.AbstractNode;
import transform.TransformIAD;
import model.ParameterNode;

public class ParameterExp extends PrimitiveExp{

	public ParameterExp(AbstractNode contents) {
		super(contents);
	}

	@Override
	public void interpreted(TransformIAD iad) {
		iad.parameterInterpretedBegin((ParameterNode)this.getContents());
		iad.parameterInterpretedEnd((ParameterNode)this.getContents());
	}

}
