package transform;

import model.ClassNode;
import model.FieldNode;
import model.MethodNode;
import model.ParameterNode;

public class TransformIAD_Java extends TransformIAD{
	
	private Visitor java = new VisitorForJava();
	
	public void classInterpretedBegin(ClassNode node) {
		java.visitClassBegin(node);
	}
	public void classInterpretedEnd(ClassNode node) {
		java.visitClassEnd(node);
	}
	public void methodInterpretedBegin(MethodNode node) {
		java.visitMethodBegin(node);
	}
	public void methodInterpretedEnd(MethodNode node) {
		java.visitMethodEnd(node);
	}
	public void fieldInterpretedBegin(FieldNode node) {
		java.visitFieldBegin(node);
	}
	public void fieldInterpretedEnd(FieldNode node) {
		java.visitFieldEnd(node);
	}
	public void parameterInterpretedBegin(ParameterNode node) {
		java.visitParameterBegin(node);
	}
	public void parameterInterpretedEnd(ParameterNode node) {
		java.visitParameterEnd(node);
	}

}
