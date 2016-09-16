package transform;

import model.ClassNode;
import model.FieldNode;
import model.MethodNode;
import model.ParameterNode;

public abstract class Visitor {
	
	public abstract void visitClassBegin(ClassNode clazz);
	public abstract void visitClassEnd(ClassNode clazz);
	public abstract void visitMethodBegin(MethodNode clazz);
	public abstract void visitMethodEnd(MethodNode clazz);
	public abstract void visitFieldBegin(FieldNode clazz);
	public abstract void visitFieldEnd(FieldNode clazz);
	public abstract void visitParameterBegin(ParameterNode clazz);
	public abstract void visitParameterEnd(ParameterNode clazz);

}
