package wiprofirst.allasiment;

import java.util.Stack;

public class fourthassiment {
public static void main(String[] args) {
	Stack<String> undostack = new Stack<>();
	undostack.push("edit");
	undostack.push("save");
	undostack.push("update");
	
	String undoone = undostack.pop();
	System.out.println("undo :" + undostack);
	
	String readd = undostack.push(undoone);
	System.out.println("readd :" + undostack);
}
}
