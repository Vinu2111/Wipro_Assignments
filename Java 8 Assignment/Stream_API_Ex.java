package com.rk;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream_API_Ex {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(4, 5, 6, 1, 2, 3, 5, 7, 0, 7, 15);

		
		Optional<String> name=Optional.of("rk");
		name.ifPresent(n->System.out.println("hello"+n));
		
		
		
		
		//nums.parallelStream().
		nums.parallelStream().forEach(n -> {
			System.out.println(n + "---" + Thread.currentThread().getName());
		});
		
		
		///parell stream java create threads for us
		
		
		
		
		
		
		
		
		
		
		

		// 3 stream
		// creating stream
		/*
		 * nums.stream() .sorted() .map(n->n*4) .forEach(n->System.out.println(n));
		 */

		int finalResult = nums.stream().distinct().filter(n -> n % 2 == 1).sorted().map(n -> n * 4).reduce(0,
				(x, y) -> x + y);
		System.out.println(finalResult);

		// Stream<Integer> data=nums.stream();
		// Mapp function

		// Stream<Integer> mappedvalues=data.map(n->n*5);
		// mappedvalues.forEach(n->System.out.println(n));

		// count fucntion
		// Long countElements= data.count();
		// System.out.println(countElements);

		// Stream<Integer> sortedStream = data.sorted();
		// sortedStream.forEach(n->System.out.println(n));

		// System.out.println(sortedStream);
		// consuming
		// data.forEach(n->System.out.println(n));

		// data.forEach(n->System.out.println(n));

	}

}
