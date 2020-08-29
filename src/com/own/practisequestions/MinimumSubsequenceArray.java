package com.own.practisequestions;

//Input: arr[] = {2, 3, 1, 5, 6, 3, 7, 9, 14, 10, 2, 5}, K = 35
//Output: 4
//Smallest subsequence with the sum greater 
//than or equal to the given sum K is {7, 9, 14, 10}
//Input: arr[] = {1, 2, 2, 2, 3, 4, 5, 4, 7, 6, 5, 12}, K = 70
//Output:-1
//Subsequence with sum greater than equal to the given sum is not possible.
public class MinimumSubsequenceArray {

	public static void main(String[] ar) {
		int[] input = { 2, 3, 1, 5, 6, 3, 7, 9, 14, 10, 2, 5 };
		int k = 35;
		
		int count = input.length;
		for (int i = 0; i < input.length; i++) {
			int sum = 0;
			int temp = 0;
			for (int j = i; j < input.length; j++) {
				sum = sum + input[j];
				temp++;
				if (sum >= k) {
					break;
				}

			}
			if (count > temp && sum >= k) {
				count = temp;

			}

		}

		System.out.println(count);
	}

}
