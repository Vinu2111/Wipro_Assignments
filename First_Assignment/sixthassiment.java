package wiprofirst.allasiment;

import java.util.ArrayDeque;

public class sixthassiment {

	public static void main(String[] args) {
		ArrayDeque<String> gs = new ArrayDeque<String>();
		gsadd(gs,"Prajwal");
		gsadd(gs,"bapu");
		gsadd(gs,"Raju");
		gsadd(gs,"vaibh");
		System.out.println("all person gs store : " + gs);
		
	}

	private static void gsadd(ArrayDeque<String> gs, String person) {
		// TODO Auto-generated method stub
		if(person.length()%2 == 0) {
//		gs.remove(person);
			gs.addFirst(person);
			
		}
		else {
			gs.addLast(person);
		}
		
		
	}
}
