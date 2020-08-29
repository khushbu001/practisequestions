package com.own.practisequestions;

public class CreatingLambdaExpression {
	interface XFunctional{
		int operation(int a, int b);
	}

	public static void main(String[] args) {
	
		XFunctional  operation1 = (int a, int b) ->  a+b;
		
		System.out.println(operation1);
	}

}
