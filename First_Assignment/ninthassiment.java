package wiprofirst.allasiment;

import java.util.concurrent.ArrayBlockingQueue;

public class ninthassiment {
public static void main(String[] args) {
	ArrayBlockingQueue<String> document = new ArrayBlockingQueue<String>(3);
	adddoc(document,"Doc1");
	adddoc(document,"Doc2");
	adddoc(document,"Doc3");
	adddoc(document,"Doc4");
	
	while(!document.isEmpty()) {
		System.out.println("printing :" + document.poll());
	}
	
}

private static void adddoc(ArrayBlockingQueue<String> document, String string) {
	// TODO Auto-generated method stub
	if(!document.offer(string)) {
		System.out.println("Skipped :"+ string);
	}
	
}
}
