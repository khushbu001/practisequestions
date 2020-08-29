package com.own.practisequestions;

import java.util.Arrays;

public class SortNumericArray {

	public static void main(String[] args) {
		int[] input = { 2, 1, 9, 4, 2, 7, 8, 5, 19, 6, 14 };

		System.out.println(input.length);

		for (int j = 0; j < input.length - 1; j++) {
			for (int i = 0; i < input.length - 1; i++) {
				if (input[j] > input[i + 1]) {
					int temp = input[i];
					input[i] = input[i + 1];
					input[i + 1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(input));
	}

}
