package wiprofirst.javaeightassiment;

import java.util.ArrayList;

public class firstassiment {
public static void main(String[] args) {
	
	ArrayList<String> names = new ArrayList<String>();
	names.add("prajwa");
	names.add("raju");
	names.add("vaibhav");
	names.add("anand");
	System.out.println(names);
	
	System.out.println("after sort");
	
	names.sort((name1,name2)->name1.compareTo(name2));
	System.out.println(names);
}
}
