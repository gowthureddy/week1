package com.pojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem8Class {
	public static List<Integer> sortMergedArrayList(List<Integer> list1, List<Integer> list2) {

		List<Integer> totalList = new ArrayList();
		list1.addAll(list2);
		Collections.sort(list1);
		totalList.add(list1.get(2));
		totalList.add(list1.get(6));
		totalList.add(list1.get(8));

		return totalList;
	}

}
