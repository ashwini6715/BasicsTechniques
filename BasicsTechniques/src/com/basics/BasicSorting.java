package com.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicSorting {
	public static void main(String[] args) {
		List<Integer> in = Arrays.asList(21, 33, 12, 44, 54, 34, 22, 98, 112, 67);
		System.out.println(in.stream().sorted().collect(Collectors.toList()));
	}
}
