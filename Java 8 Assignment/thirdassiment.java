package wiprofirst.javaeightassiment;

interface messagepriniter{
	void messageprint(String message);
	
}

public class thirdassiment {

	public static void greetmessage (String name,messagepriniter printer) {
		String message = "Hello, " + name + "! Welcome!";
		printer.messageprint(message);
		
	}
	
	public static void main(String[] args) {

		greetmessage("prajwal", msg->System.out.println(msg));
	}
}
