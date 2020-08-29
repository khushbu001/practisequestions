package com.own.practisequestions;

import java.util.Scanner;

public class SqureRootWithoutMethod {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		double maxpossible= number/ 2.0;
		double tempVal = maxpossible;
		do {
			tempVal = maxpossible;
			maxpossible = (tempVal+(number/tempVal)) /2;
			
		} while((tempVal - maxpossible) !=0);
		System.out.println("squre root of given number "+number+" "+maxpossible);
	
		
	}

}
