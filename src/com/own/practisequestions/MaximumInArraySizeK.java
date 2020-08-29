package com.own.practisequestions;

import java.util.ArrayList;
import java.util.List;

public class MaximumInArraySizeK {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
		int size = 3;
		List<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i <= arr.length - size; i++) {
			int max = 0;
			for (int j = i; j < i + size; j++) {
				if (max < arr[j]) {
					max = arr[j];
				}
			}
			arrayList.add(max);
			System.out.print(max + " ");
		}

	}

}
