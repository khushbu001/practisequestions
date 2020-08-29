package com.own.practisequestions;

import java.util.Arrays;

/**
 * 
 * @author Khushbu 18-Jul-2020
 */
public class StringSorting {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringSorting str = new StringSorting();
		String[] sortedString = { "qwe", "hji", "hiea","abh", "io" };
		sortedString = str.sortString(sortedString);

	}

	/**
	 * @param input
	 * @return
	 */
	public String[] sortString(String[] input) {
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = 0; j < input.length - 1; j++) {
				if (input[i].length() < input[j+1].length()) {
					String temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}

			}
		}
//		Arrays.sort(input);
		System.out.println(Arrays.toString(input));
		return input;
	}

}
