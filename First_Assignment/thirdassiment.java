package wiprofirst.allasiment;

import java.util.ArrayDeque;

public class thirdassiment {
public static void main(String[] args) {
	ArrayDeque<String> searches = new ArrayDeque<String>();
	
	addSearch(searches, "Java");
    addSearch(searches, "Python");
    addSearch(searches, "C++");
    System.out.println("Searches: " + searches);

    addSearch(searches, "JavaScript");  // This will remove the oldest: "Java"
    System.out.println("Searches after new search: " + searches);
	

}

private static void addSearch(ArrayDeque<String> deque, String string) {
	// TODO Auto-generated method stub
	if(deque.size()==3) {
		deque.removeFirst();
	}
	deque.addLast(string);
	
}
}
