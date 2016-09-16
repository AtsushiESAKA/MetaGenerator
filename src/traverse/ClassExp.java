package traverse;

import model.AbstractNode;
import transform.TransformIAD;
import model.ClassNode;

public class ClassExp extends CompositeExp{

	public ClassExp(AbstractNode contents) {
		super(contents);
	}

	@Override
	public void interpreted(TransformIAD iad) {
		iad.classInterpretedBegin((ClassNode)this.getContents());
		
		for(Exp c : this.getChildren()) {
			c.interpreted(iad);
		}
		
		iad.classInterpretedEnd((ClassNode)this.getContents());
	}

}
