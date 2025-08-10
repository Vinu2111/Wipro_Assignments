package wiprofirst.javaeightassiment;

import java.util.Optional;

public class secondassiment {
public static void main(String[] args) {
	Optional<Integer> result = divide(20,10);
	if(result.isEmpty()) {
		System.out.println("not allowed");
	}
	else {
		System.out.println(result.get());
	}
	
}

private static Optional<Integer> divide(int i, int j) {
	// TODO Auto-generated method stub
	
	if(j == 0) {
		return Optional.empty();
	}
	else {
		
		return Optional.of(i/j);
	}
}
}
