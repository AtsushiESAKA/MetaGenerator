package transform;

import model.ClassNode;
import model.FieldNode;
import model.MethodNode;
import model.ParameterNode;

public abstract class TransformIAD {
	
	public abstract void classInterpretedBegin(ClassNode node);
	public abstract void classInterpretedEnd(ClassNode node);
	public abstract void methodInterpretedBegin(MethodNode node);
	public abstract void methodInterpretedEnd(MethodNode node);
	public abstract void fieldInterpretedBegin(FieldNode node);
	public abstract void fieldInterpretedEnd(FieldNode node);
	public abstract void parameterInterpretedBegin(ParameterNode node);
	public abstract void parameterInterpretedEnd(ParameterNode node);

}
