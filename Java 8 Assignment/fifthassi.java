package wiprofirst.javaeightassiment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fifthassi {
public static void main(String[] args) {
	List<String> names = new ArrayList<String>();
	
	names.add("prajwal");
	names.add("Anup");
	names.add("Anand");
	
	List<String> filtername = names.stream()
								.filter(name->name.startsWith("A"))
								.collect(Collectors.toList());
System.out.println(filtername);
}
}
