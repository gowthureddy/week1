package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.pojo.Problem8Class;

public class Problem8Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {

			int value = scanner.nextInt();
			list1.add(value);
		}

		List<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {

			int value = scanner.nextInt();
			list2.add(value);
		}

		List<Integer> result = Problem8Class.sortMergedArrayList(list1, list2);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
		scanner.close();

	}

}
