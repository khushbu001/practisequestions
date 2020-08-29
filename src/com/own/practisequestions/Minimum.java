package com.own.practisequestions;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Minimum {

	// Function to find the smallest
	// subsequence such that sum of elements
	// is greater than equal to given number K
	static int lengthOfSmallestSubsequence(int k, int[] v) {
		// Initialize priority queue
		Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		// Loop to insert all elements into
		// the priority queue
		for (int i = 0; i < v.length; i++) {
			pq.add(v[i]);
		}
		System.out.println(pq);
		int sum = 0;
		int count = 0;

		// Loop to find the smallest
		// subsequence such that sum of elements
		// is greater than equal to given number K
		while (!pq.isEmpty() && sum < k) {
			sum += pq.peek();
			pq.remove();
			count++;
		}

		// If sum is less then K
		// then return -1 else return count.
		if (sum < k) {
			return -1;
		}
		return count;
	}

	// Driver code
	public static void main(String[] args) {
		int[] v = { 2, 3, 1, 5, 6, 3, 7, 9, 14, 10, 2, 5 };
		int k = 35;
		System.out.print(lengthOfSmallestSubsequence(k, v));
	}
}
