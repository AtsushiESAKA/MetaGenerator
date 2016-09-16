package traverse;

import transform.TransformIAD;
import model.FieldNode;
import model.Node;

public class FieldExp extends PrimitiveExp{

	public FieldExp(Node contents) {
		super(contents);
	}

	@Override
	public void interpreted(TransformIAD iad) {
		iad.fieldInterpretedBegin((FieldNode)this.getContents());
		iad.fieldInterpretedEnd((FieldNode)this.getContents());
	}

}
