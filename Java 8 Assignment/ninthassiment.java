package wiprofirst.javaeightassiment;

import java.util.Arrays;
import java.util.List;

public class ninthassiment {
public static void main(String[] args) {
	List<Integer> nums = Arrays.asList(2,3,4,5);
	nums.parallelStream().forEach(n->{
		int square = n*n;
		System.out.println("num :" + n + " square : " + square + "threa : " + Thread.currentThread());
	}
			
		
			);
}
}
