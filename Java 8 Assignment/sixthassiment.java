package wiprofirst.javaeightassiment;

import java.util.ArrayList;
import java.util.List;

public class sixthassiment {
public static void main(String[] args) {
	List<String> words = new ArrayList<String>();
	words.add("prajwal");
	words.add("shruti");
	words.add("raju");
	words.add("babu");
	long nums = words.stream().filter(n->n.length()>5).count();
	System.out.println(nums);
}
}
