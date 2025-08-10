package wiprofirst.allasiment;

import java.util.ArrayDeque;

public class eightassiment {

	public static void main(String[] args) {
		ArrayDeque<String> msg = new ArrayDeque<String>();
		msgadd(msg,"fb");
		msgadd(msg,"snap");
		msgadd(msg,"wp");
		msgadd(msg,"in");
		
	System.out.println("before update : " + msg);
	
	
	}

	private static void msgadd(ArrayDeque<String> msg, String string) {
		// TODO Auto-generated method stub
		if(msg.size()==3) {
			msg.removeFirst();
		}
		
			msg.addLast(string);
		
		
	}
}
