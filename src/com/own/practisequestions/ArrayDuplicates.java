package com.own.practisequestions;

import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Khushbu 28-Jun-2020
 */
public class ArrayDuplicates {

	public static void main(String[] args) {
		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
		Scanner scan = new Scanner(System.in);

//		System.out.println("Enter size number of Array");
		// int[] input = new int[scan.nextInt()];
		int[] input = { 1, 4, 5, 6, 6, 7, 7 ,8};

//		for (int i = 0; i < input.length; i++) {
//			input[i] = scan.nextInt();
//			System.out.println("Array value" + input[i]);
//		}

		// find unique values
		List<Integer> uniqueValues = removeDuplicates.findUniqueValues(input);
		for (int i = 0; i < uniqueValues.size(); i++) {
			if (uniqueValues.get(i) != -1) {
				System.out.println("uniqueElements are " + uniqueValues.get(i));
			}
		}
		scan.close();
	}

}