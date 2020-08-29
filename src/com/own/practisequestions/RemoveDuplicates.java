package com.own.practisequestions;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Khushbu 28-Jun-2020
 */
public class RemoveDuplicates {
	/**
	 * 
	 * @param input
	 * @return
	 */
	public List<Integer> findUniqueValues(int[] input) {
		List<Integer> uniqueValues = new ArrayList<>();
		int iteration = 0;
		while (iteration < input.length) {
			int count = 0;
			for (int i = iteration+1; i < input.length; i++) {
				if (input[iteration] == input[i]) {
					input[i] = -1;
					count++;
				}

			}
			if (count == 0) {
				uniqueValues.add(input[iteration]);

			}
			iteration++;
		}
		return uniqueValues;
	}

}