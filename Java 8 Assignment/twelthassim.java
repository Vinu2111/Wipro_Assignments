package wiprofirst.javaeightassiment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class twelthassim {

	public static void main(String[] args) {
		   List<String> names = Arrays.asList("Ravi", "Amit", "Sita", "Anita");

	        // Sort using method reference
	        Collections.sort(names, String::compareTo);

	        // Print sorted list
	        System.out.println("Sorted names: " + names);
	}
}
