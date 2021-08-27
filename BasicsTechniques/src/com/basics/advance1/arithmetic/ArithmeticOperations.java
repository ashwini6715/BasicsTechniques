package com.basics.advance1.arithmetic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;

public class ArithmeticOperations {

	public static void main(String[] args) {
		List<Integer> in = Arrays.asList(21, 33, 12, 44, 54, 34, 22, 98, 112, 67);

		// Summary Statistics(Count,sum,min,avaergae,max)
		IntSummaryStatistics stats = in.stream().mapToInt(x -> x).summaryStatistics();

		System.out.println(stats);

		System.out.println("=============================================================================");

		in.stream().max(Comparator.comparing(i -> i)).ifPresent(max -> System.out.println("Max Number: " + max));
		System.out.println("=============================================================================");

		in.stream().min(Comparator.comparing(i -> i)).ifPresent(min -> System.out.println("Min Number: " + min));
		
		System.out.println("=============================================================================");
		System.out.println("Count: "+in.stream().count());
		
		System.out.println("=============================================================================");
		System.out.println("Average: "+in.stream().mapToInt(i->i).average().getAsDouble());
		
	}

}
