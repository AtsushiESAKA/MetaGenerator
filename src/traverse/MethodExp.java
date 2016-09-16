package traverse;

import model.AbstractNode;
import transform.TransformIAD;
import model.MethodNode;

public class MethodExp extends CompositeExp{

	public MethodExp(AbstractNode contents) {
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
