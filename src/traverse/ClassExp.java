package traverse;

import transform.TransformIAD;
import model.ClassNode;
import model.Node;

public class ClassExp extends CompositeExp{

	public ClassExp(Node contents) {
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
