package traverse;

import model.AbstractNode;
import transform.TransformIAD;
import model.FieldNode;

public class FieldExp extends PrimitiveExp{

	public FieldExp(AbstractNode contents) {
		super(contents);
	}

	@Override
	public void interpreted(TransformIAD iad) {
		iad.fieldInterpretedBegin((FieldNode)this.getContents());
		iad.fieldInterpretedEnd((FieldNode)this.getContents());
	}

}
