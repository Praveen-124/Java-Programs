package com.javaPrograms;

import java.lang.Math;

public class BasicPrograms {

	public static void main(String... args) {

		printAscii();
	}

//	Fibonacci Series in Java
//	0, 1, 1, 2, 3, 5, 8, 13, ....
	public static void fibonacci(int n) {
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a + ", ");
		System.out.print(b + ", ");
		for (int i = 0; i < n; i++) {
			c = a + b;
			System.out.print(c + ", ");
			a = b;
			b = c;

		}
	}

//	Prime Number Program in Java
	public static void primeNumbers(int n) {
		int flag = 0;

		int halfRange = n / 2;
		for (int i = 2; i <= halfRange; i++) {
			if (n % i == 0) {
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");

		}
	}

//	Palindrome Program in Java
	public static void palindromeString(String word) {
		char[] words = word.toCharArray();
		int flag = 0;
		int start = 0;
		int end = words.length - 1;
		while (start < end) {
			if (words[start] != words[end]) {
				flag = 1;
			}
			start++;
			end--;
		}
		if (flag == 0) {
			System.out.println(word + " is a palindrome");
		} else {
			System.out.println(word + " is not a palindrome");
		}
	}

	public static void palindromeInteger(int num) {
		int reverseNum = 0;
		int lastDigit = 0;
		int temp = num;
		while (temp > 0) {
			lastDigit = temp % 10;
			reverseNum = (reverseNum * 10) + lastDigit;
			temp = temp / 10;
		}
		if (num == reverseNum) {
			System.out.println(num + " is a palindrome");
		} else {
			System.out.println(num + " is not a palindrome");
		}
	}

//	Factorial Program in Java
	public static int Factorial(int num) {
//		int result = 1;
//		for (int i = num ; i>0; i--) {
//			result = result * i;
//		}
//		System.out.println("Factorial of "+num+" is "+result);

		if (num <= 0) {
			return 1;
		} else {
			return num * Factorial(num - 1);
		}
	}

//	Armstrong Number in Java
	public static void Armstrong(int num) {
		int temp = num;
		int digits = 0;
		int sum = 0;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = num;
		int lastDigit = 0;
		while (temp > 0) {
			lastDigit = temp % 10;
			sum = (int) (sum + Math.pow(lastDigit, digits));
			temp /= 10;
		}
		System.out.println(sum);
		if (num == sum) {
			System.out.println(num + " is an armstrong number");
		} else {
			System.out.println(num + " is not armstrong number");
		}

	}

//	To generate random number.
	public static int rollDice() {
		int min = 1;
		int max = 6;
		return (int) (Math.random() * (max - min + 1) + min);
	}

//	To Print Pattern in Java
	public static void starPatternRight(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

//	To Print Pattern in Java
	public static void startPatternLeft(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n - 1; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

//	To Print Pattern in Java
	public static void startPatternDiamond(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < n - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

//	To Compare Two Objects in Java
	public static void compareTwoObj() {
//		String name1 = "Praveen";
//		String name2 = "Praveen";
		BasicPrograms outer = new BasicPrograms();

		Name1 name1 = outer.new Name1();
		Name2 name2 = outer.new Name2();

		System.out.println(name1.name1.hashCode());
		System.out.println(name2.name2.hashCode());
		if (name1.equals(name2)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
//		if(name1 == name2) {
//			System.out.println("Yes");
//		}
	}
	public class Name1 {
		String name1 = "Praveen";
	}

	public class Name2 {
		String name2 = "Praveen";
	}

//	To Print ASCII Value in Java
	public static void printAscii() {
		for (int i = 0; i <= 255; i++) {
			System.out.println("ASCII value for " + (char) i + " : " + i);
		}
	}

}
