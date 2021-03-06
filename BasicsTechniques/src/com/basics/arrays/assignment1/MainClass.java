package com.basics.arrays.assignment1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainClass {
	public static void main(String[] args) {
		Book[] bookArr = new Book[7];

		bookArr[0] = new Book(1, "sBook1", "Completed");
		bookArr[1] = new Book(2, "gBook2", "Progress");
		bookArr[2] = new Book(3, "dBook3", "Completed");
		bookArr[3] = new Book(4, "vBook4", "Progress");
		bookArr[4] = new Book(5, "uBook5", "Progress");
		bookArr[5] = new Book(6, "jBook6", "Completed");
		bookArr[6] = new Book(7, "eBook7", "Completed");
		sortBooks(bookArr);
	}

	public static Book[] sortBooks(Book[] bookArr) {
		List<Book> list = Arrays.asList(bookArr);

		Map<String, List<Book>> map = list.stream()
				.sorted(Comparator.comparing(Book::getStatus).thenComparing(Comparator.comparing(Book::getName)))
				.collect(Collectors.groupingBy(Book::getStatus, Collectors.toList()));

		System.out.println(map);

//	List<List<Book>> returnList = list.stream().collect(Collectors.groupingBy(p -> p.getStatus())).values()
//				.stream().flatMap(group -> group.st).collect(Collectors.toList());

		// list.forEach(r->System.out.println(r.getName()));

		return bookArr;
	}
}
