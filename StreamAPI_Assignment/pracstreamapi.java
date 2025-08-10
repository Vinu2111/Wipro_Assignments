package wiprofirst.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class pracstreamapi {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4,5,6,7,8,9);
//		Stream<Integer> data = nums.stream();
//		long countelements = data.count();
//		System.out.println(countelements);
//		
//		Stream<Integer> sortedstream = data.sorted();
//		sortedstream.forEach((n)->System.out.println(n));
//		Stream<Integer> mappedvalues=data.map(n->n*5);
//		mappedvalues.forEach(n->System.out.println(n));
		nums.stream()
					.sorted()
					.map(n->n*4)
					  .forEach(n -> System.out.println(n));
	}
}

 