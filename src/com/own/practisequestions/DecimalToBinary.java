package com.own.practisequestions;

import java.util.Scanner;

class DecimalToBinary {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();

		// number 13
		// 2^0=1 2^1=2 2^2=4 2^3=8 2^4=16
		// 1101

		if (number == 1) {
			System.out.println("binary val:" + 1);
		}
		int counter = 1;
		if (number > 1) {
			for (int i = 1; i <= number; i++) {
				int value = (int) Math.pow(2, i);
				if (value <= number) {
					counter++;
				} else if (value > number) {
					break;
				}
			}
		}

		int[] binaryValues = new int[counter];
		int index = 0;
		int powVal = counter - 1;
		while (powVal >= 0) {
			int value = (int) Math.pow(2, powVal); // 8
			if (value <= number) {
				binaryValues[index] = 1;
				number = number - value;
				index++;
			} else {
				binaryValues[index] = 0;
				index++;
			}
			powVal--;
		}
		for (int i = 0; i < counter; i++) {
			System.out.print(binaryValues[i]);

		}
	}
}
