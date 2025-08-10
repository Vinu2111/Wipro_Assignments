package wiprofirst.javaeightassiment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class seventassi {
public static void main(String[] args) {
	List<Integer> allnum = Arrays.asList(2,4,6,8,3,5);
	List<Integer> evennum = allnum.stream().filter(n->n%2==0).collect(Collectors.toList());
	System.out.println(evennum);
}
}
