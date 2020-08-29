package com.own.practisequestions;

public class Febonacii {

	//0 1 1 2 3 5 8 13  21...
	public static void main(String[] args) {
		int number =30;
		int num1= 0;
		int num = 1;
		int fab =1;
		for(int i = 1; fab< number; i++) {
			fab=num1+num;
			num1=num;
			num=fab;
			System.out.print(fab+" ");
		}
		
		
	}

}
