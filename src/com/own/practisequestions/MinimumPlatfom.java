package com.own.practisequestions;

//1) Given arrival and departure times of all trains that reach a railway station, the task is to find the
//minimum number of platforms required for the railway station so that no train waits.
//We are given two arrays which represent arrival and departure times of trains that stop.
//Example Input & Output:
//Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}
//dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
//Output: 3

public class MinimumPlatfom {

	public static void main(String[] ag) {
		
		Double[] arr = { 9.00, 9.40};
		Double[] dept = { 9.10, 12.00};
		int minimumNumber = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < dept[i - 1]) {
				minimumNumber++;

			}

		}
		if(minimumNumber == 0)
			minimumNumber++;
		
		System.out.println(minimumNumber);

	}

}
