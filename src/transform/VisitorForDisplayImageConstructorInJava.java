package transform;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import model.ClassNode;
import model.FieldNode;
import model.MethodNode;
import model.ParameterNode;

/**
 * TODO まずは、DIC in Java 用のVisitor．その後，汎用化を試みる
 *
 */
public class VisitorForDisplayImageConstructorInJava extends Visitor{
	
	private String outputPath = "./";
	private String fPath;
	private File newfile;
	private PrintWriter pw;
	
	public void visitClassBegin(ClassNode clazz) {
		//以下のパラメタをClassNodeから取得
		String className = "";
		String packageName = "";
		
		//javaファイルを生成
		fPath = outputPath + className+".java";
		newfile = new File(fPath);
		try {
			pw = new PrintWriter(new BufferedWriter(new FileWriter(newfile)));
			
			pw.println("package " + packageName + ";");
			
			//importはどうするのか(クラス図から生成は不可能なので、穴あきコードになる？)
			//pw.println("import " + packageName + ";");
			
			pw.println("public class "+className+" {");
			pw.println("");
			pw.println("¥t public "+className+"(MappingRule mr) {");
			pw.println("¥t¥t this.mr = mr");
			pw.println("¥t }");
			pw.println("");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
	public void visitClassEnd(ClassNode clazz) {
		pw.println("}");
	}
	public void visitMethodBegin(MethodNode clazz) {
		String methodName = "";
		pw.println("¥t public " +methodName+"(Model model) {");
		pw.println("¥t¥t model.interpret(mr);");
		pw.println("¥t¥t result = mr.interpret(mr);");
	}
	public void visitMethodEnd(MethodNode clazz) {		
		pw.print("¥t}");
	}
	public void visitFieldBegin(FieldNode clazz) {
		String modifName = "";
		String attrName = "";
		String attrTypeName = "";
		pw.println("¥t"+modifName+" "+attrTypeName+" "+ attrName+ ";");
	}
	public void visitFieldEnd(FieldNode clazz) {
		//Do nothing
	}
	public void visitParameterBegin(ParameterNode clazz) {
		List<String> paramNames = null;
		List<String> paramTypeNames = null;
		
		int size = paramNames.size();
		for (int i = 0; i < size; i++) {
			pw.print(paramTypeNames.get(i) +" "+ paramNames.get(i));
			if (i < size-1) {
				pw.print(", ");
			}
		}
	}
	public void visitParameterEnd(ParameterNode clazz) {
		//Do nothing
	}

}
