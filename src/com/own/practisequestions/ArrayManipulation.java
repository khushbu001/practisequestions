package com.own.practisequestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {

	public static void main(String[] args) {
		ArrayManipulation arrayManipulation = new ArrayManipulation();
		String[] str = { "try", "uht", "rth", "try" };
		int[] inputArray = { 11, 87, 99, 54, 67, 87, 199, 34, 33 };
		int findVal = 11;
		arrayManipulation.findValue(findVal, inputArray);
		arrayManipulation.sumAndAverage(inputArray);
		arrayManipulation.maximumAndMinimun(inputArray);
		arrayManipulation.findDuplicateValues(inputArray);
		arrayManipulation.findDuplicateValuesString(str);
		arrayManipulation.reverse(inputArray);
		arrayManipulation.removeDuplicateValues(inputArray);
		arrayManipulation.secondLargestElement(inputArray);
		arrayManipulation.binarySearch(inputArray, findVal);

	}

	/**
	 * 
	 * @param inputArray
	 */
	private void binarySearch(int[] inputArray, int findVal) {
		int flag = 0;
		Arrays.sort(inputArray);
		int initialPosition = 0;
		int arrLength = inputArray.length;
		while (initialPosition <= arrLength) {

			int midIndex = initialPosition + (arrLength - initialPosition) / 2;

			if (inputArray[midIndex] == findVal) {
				System.out.println("value present at index " + midIndex);
				flag += 1;
				break;
			}
			if (inputArray[midIndex] > findVal) {
				arrLength = midIndex - 1;

			}
			if (inputArray[midIndex] < findVal) {
				initialPosition = midIndex + 1;
			}

		}
		if (flag == 0) {
			System.out.println("value not present in the array");

		}
		System.out.println(Arrays.toString(inputArray));

	}

	/**
	 * @param inputArray
	 */
	private void secondLargestElement(int[] inputArray) {
		int largest = 0;
		int secondLargest = 0;
		if (inputArray[0] > inputArray[1]) {
			largest = inputArray[0];
		} else if (inputArray[0] < inputArray[1]) {
			largest = inputArray[1];
		}
		for (int i = 2; i < inputArray.length; i++) {
			if (inputArray[i] > largest) {
				secondLargest = largest;
				largest = inputArray[i];
			} else if (inputArray[i] < largest && inputArray[i] > secondLargest) {
				secondLargest = inputArray[i];
			}

		}
		System.out.println("secondLargest element " + secondLargest);
		System.out.println(1.0 / 0);

	}

	/**
	 * 
	 * @param inputArray
	 */
	private void removeDuplicateValues(int[] inputArray) {
		int[] uniqueElements = new int[inputArray.length];
		List<Integer> unique = new ArrayList<>();
		int index = 0;
		for (int i = 0; i < inputArray.length - 1; i++) {
			int count = 0;
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] == inputArray[j]) {
					count++;
				}

			}
			if (count == 0) {
				uniqueElements[index++] = inputArray[i];
				unique.add(inputArray[i]);

			}
		}
		System.out.println("unique elements are " + Arrays.toString(uniqueElements));
		System.out.println("unique elements are " + unique);

	}

	private void reverse(int[] inputArray) {
		int arrayLength = inputArray.length - 1;
		for (int i = 0; i < arrayLength; i++, arrayLength--) {
			int temp = inputArray[i];
			inputArray[i] = inputArray[arrayLength];
			inputArray[arrayLength] = temp;

		}

		System.out.println(Arrays.toString(inputArray));

	}

	/**
	 * @param str
	 */
	private void findDuplicateValuesString(String[] str) {
		for (int i = 0; i < str.length - 1; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					System.out.println(str[i] + " is a duplicate value");

				}
			}
		}
	}

	/**
	 * 
	 * @param inputArray
	 */
	private void findDuplicateValues(int[] inputArray) {

		for (int i = 0; i < inputArray.length - 1; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] == inputArray[j]) {
					System.out.println(inputArray[i] + " is a duplicate value");
				}

			}

		}

	}

	/**
	 * 
	 * @param inputArray
	 */
	private void maximumAndMinimun(int[] inputArray) {
		int min = inputArray[0];
		int max = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (min > inputArray[i]) {
				min = inputArray[i];

			}
			if (max < inputArray[i]) {
				max = inputArray[i];

			}

		}
		System.out.println("max value " + max + " min value" + min);

	}

	/**
	 * @param inputArray
	 */
	private void sumAndAverage(int[] inputArray) {
		int sum = 0;
		for (int i = 0; i < inputArray.length; i++) {
			sum = sum + inputArray[i];
		}

		System.out.println("sum " + sum);

		int average = sum / inputArray.length;
		System.out.println("average val" + average);

	}

	/**
	 * @param findVal
	 * @param inputArray
	 */
	private void findValue(int findVal, int[] inputArray) {
		int count = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == findVal) {
				System.out.println("value present in the array" + findVal);
				System.out.println("index value present in the array" + i);

				count++;
				break;

			}

		}
		if (count == 0) {
			System.out.println("value not present in the array " + findVal);

		}

	}
}
