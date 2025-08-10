package wiprofirst.javaeightassiment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class eightassiment {
public static void main(String[] args) {
	List<String> city = new ArrayList<String>();
	city.add("nagpur");
	city.add("amaravti");
	city.add("bhandara");
	String collect = city.stream().collect(Collectors.joining(","));
	System.out.println(collect);
}
}
