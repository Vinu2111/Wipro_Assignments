package wiprofirst.javaeightassiment;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class tenthassiment {
public static void main(String[] args) {
	List<String> names = Arrays.asList("aaa","aaa","bb","bb","cc");
	Map<Object, Long> namecount = names.stream().collect(Collectors.groupingBy(name->name,Collectors.counting()));
	System.out.println(namecount);
	
}
}
