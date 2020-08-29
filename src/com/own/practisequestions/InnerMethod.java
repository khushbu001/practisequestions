package com.own.practisequestions;

public class InnerMethod {

	public InnerMethod() {
		int i = 0;
		++i;
		System.out.println("hello in constructor" + ++i);
	}

	public static void main(String[] ag) {
		System.out.println("hello in main");
		method();
	}

	static void method() {
		System.out.println("hello in static");
		class Locale {
			void hello() {
				System.out.println("hello method");
			}
		}
		Locale l = new Locale();
		l.hello();
	}

}
