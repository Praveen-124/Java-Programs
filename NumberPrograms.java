package com.javaPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberPrograms {

	public static void main(String[] args) {
		NumberPrograms obj = new NumberPrograms();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		obj.reverseNumber(num);
		
	}

//	To Reverse a Number in Java
	public int reverseNumber(int num) {
//		12345 -> 54321
		int reverseNum = 0;
		for (int temp = num; temp > 0; temp /= 10) {
			reverseNum = (reverseNum * 10) + (temp % 10);
		}
		System.out.println("Reverse number " + num + " : " + reverseNum);
		return reverseNum;
	}

	public void automorphicNumber(int num) {
//		6 -> 36,   25 -> 625
		int sqNum = num * num;
		int lastDigit = 0;
		int sqNumLastDigit = 0;
		int tempNum = num;
		int flag = 0;
		while (tempNum > 0) {
			lastDigit = tempNum % 10;
			sqNumLastDigit = sqNum % 10;
			if (lastDigit != sqNumLastDigit) {
				flag = 1;
				break;
			}
			sqNum /= 10;
			tempNum /= 10;
		}
		if (flag == 0) {
			System.out.println("Given number " + (num) + " is automorphic number");
		} else {
			System.out.println("Given number " + (num) + " is not automorphic number");
		}
	}

	public void petersonNumber(int num) {
//		145 == 1!+4!+5! or krishnamurthy Number
		int tempNum = num;
		int lastDigit = 0;
		int sum = 0;
		while (tempNum > 0) {
			lastDigit = tempNum % 10;
			sum += factorial(lastDigit);
			tempNum /= 10;
		}
		if (num == sum) {
			System.out.println("Given number " + num + " is peterson numbers");
		} else {
			System.out.println("Given number " + num + " is not a peterson numbers");
		}
	}

	public int factorial(int num) {
//		5 * 4 * 3 * 2 * 1 = 120 
		if (num <= 0) {
			return 1;
		}
		return num * factorial(num - 1);
	}

	public void sunnyNumber(int num) {
//		num = 80 -> perfect sqrt of num + 1
		double sqrtNum = Math.sqrt(num + 1);
		if (sqrtNum == Math.floor(sqrtNum)) {
			System.out.println("Given number " + num + " is a sunny number");
		} else {
			System.out.println("Given number " + num + " is not a sunny number");
		}
	}

//	overloading
	public void sunnyNumber(int start, int end) {
//		num = 80 -> perfect sqrt of num + 1
		while (start < end) {
			if (Math.sqrt(start + 1) % 1 == 0) {
				System.out.print(start + ", ");
			}
			start++;
		}
	}

	public void techNumber(int num) {
//		2025 -> 20 + 25 = 45 -> 45^2 == 2025
		int digits = 0;
		for (int temp = num; temp > 0; temp /= 10) {
			digits++;
		}
		if (digits % 2 != 0) {
			System.out.println("Enter even digits number");
			return;
		}
		int firstNum = num % (int) Math.pow(10, digits / 2);
		int secondNum = (num) / (int) Math.pow(10, digits / 2);
		int sum = firstNum + secondNum;
		if ((sum * sum) == num) {
			System.out.println("Given number " + num + " is a tech number");
		} else {
			System.out.println("Given number " + num + " is not a tech number");
		}
	}

	public void fascinatingNumber(int num) {
		String num2 = "" + num * 2;
		String num3 = "" + num * 3;
		String fasNum = num2 + num3 + num;
		int flag = 0;
		for (int i = 1; i <= 9; i++) {
			flag = 0;
			for (char j : fasNum.toCharArray()) {
				if (i == Character.getNumericValue(j)) {
					flag = 1;
				}
			}
			if (flag != 1) {
				System.out.println("Given number " + num + " is not a fascinating number");
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Given number " + num + " is a fascinating number");
		}
	}

	public void keithNumber(int num) {
//		num = 1234 -> 1+2+3+4 = 10 -> 2+3+4+10 =19 -> 1234 == num
		int digits = 0;
		for (int temp = num; temp > 0; temp /= 10) {
			digits++;
		}
		int lastDigit = 0;
		int sum = 0;
		int[] arr = new int[digits + 1];

		int temp = num;
		for (int i = 0; i < digits; i++) {
			lastDigit = temp % 10;
			arr[i + 1] = lastDigit;
			sum += lastDigit;
			arr[0] = sum;
			temp /= 10;
		}
		while (sum < num) {
			sum = 0;
			for (int i = digits; i > 0; i--) {
				arr[i] = arr[i - 1];
				sum = sum + arr[i];
			}
			arr[0] = sum;
		}

		if (arr[0] == num) {
			System.out.println("Given number " + num + " is a keith number");
		} else {
			System.out.println("Given number " + num + " is not a keith number");
		}
	}

	public void neonNum(int num) {
		int sqNum = num * num;
		int lastDigit = 0;
		int sum = 0;
		for (int temp = sqNum; temp > 0; temp /= 10) {
			lastDigit = temp % 10;
			sum += lastDigit;
		}
		if (sum == num) {
			System.out.println("Given number " + num + " is a neon number");
		} else {
			System.out.println("Given number " + num + " is not a neon number");
		}
	}

	public void spyNum(int num) {
		int digit = 0;
		int sum = 0;
		int product = 1;
		for (int temp = num; temp > 0; temp /= 10) {
			digit = temp % 10;
			sum += digit;
			product *= digit;
		}
		if (sum == product) {
			System.out.println("Given number " + num + " is a spy number");
		} else {
			System.out.println("Given number " + num + " is a not spy number");
		}
	}

	public void autobiographyNum(int num) {
		int numArr[] = new int[String.valueOf(num).length()];
		int length = numArr.length - 1;
		for (int temp = num; temp > 0; temp /= 10) {
			numArr[length] = temp % 10;
			length--;
		}
		int count = 0;
		int flag = 0;
		for (int i = 0; i < numArr.length; i++) {
			flag = 0;
			count = 0;
			for (int j : numArr) {
				if (i == j) {
					count++;
				}
			}
			if (numArr[i] != count) {
				System.out.println("Given number " + num + " is not a autobiography number");
				break;
			} else {
				flag = 1;
			}
		}
		if (flag == 1) {
			System.out.println("Given number " + num + " is a autobiography number");
		}
	}

	public void emirpNumber(int num) {
		int reverseNum = 0;
		if (isPrimeNumber(num)) {
			reverseNum = reverseNumber(num);
		}
		if (isPrimeNumber(reverseNum)) {
			System.out.println("Given number " + num + " is a Emirp number");
		} else {
			System.out.println("Given number " + num + " is not a Emirp number");
		}
	}

	public boolean isPrimeNumber(int num) {
		for (int temp = num / 2; temp > 1; temp--) {
			if (num % temp == 0) {
				return false;
			}
		}
		return true;
	}

	public void sphenicNumber(int num) {
		List<Integer> factors = new ArrayList<>();
		for (int temp = 1; temp <= num / 2; temp++) {
			if (num % temp == 0) {
				factors.add(temp);
			}
		}
		int count = 0;
		int product = 1;
		for (int i : factors) {
			if (isPrimeNumber(i) && i > 1) {
				product *= i;
				count++;
			}
			if (count == 3)
				break;
		}
		if (count == 3 && product == num) {
			System.out.println("Given number " + num + " is a sphenic number");
		} else {
			System.out.println("Given number " + num + " is not a sphenic number");
		}
	}

	public void buzzNumber(int num) {
		if (num % 10 == 7 || num % 7 == 0) {
			System.out.println("Given number " + num + " is a Buzz number");
		} else {
			System.out.println("Given number " + num + " is not a Buzz number");
		}
	}

	public void duckNumber(String num) {
		char numChar[] = num.toCharArray();
		int flag = 0;
		if (numChar[0] == '0') {
			flag = 0;
		} else {
			for (char ch : numChar) {
				if (ch == '0') {
					flag = 1;
				}
			}
		}
		if (flag == 1) {
			System.out.println("Given number " + num + " is a Duck number");
		} else {
			System.out.println("Given number " + num + " is not a Duck number");
		}
	}

	public void evilNumber(int num) {
		long binaryNum = convertToBinary(num);
		System.out.println(binaryNum);
		int countOnes = 0;

		for (long temp = binaryNum; temp > 0; temp /= 10) {
			if (temp % 10 == 1) {
				countOnes++;
			}
		}

		if (countOnes % 2 == 0) {
			System.out.println("Given number " + num + " is a Evil number");
		} else {
			System.out.println("Given number " + num + " is a Odious number");
		}
	}

	public long convertToBinary(int num) {
		long binaryNum = 0;
		int rem = 0;
		int digit = 1;
		for (int temp = num; temp > 0; temp /= 2) {
			rem = temp % 2;
			binaryNum += rem * digit;
			digit *= 10;
		}
		return binaryNum;
	}

	public void isbnNumber(long num) {
		long sum = 0;
		int product = 1;
		for (long temp = num; temp > 0; temp /= 10) {
			sum = sum + (temp % 10) * product;
			product++;
		}
		if (sum % 11 == 0) {
			System.out.println("Given number " + num + " is a ISBN number");
		} else {
			System.out.println("Given number " + num + " is not a ISBN number");
		}
	}

	public void bouncyNumber(int num) {
		String strNum = Integer.toString(num);
		int firstNum = 0;
		int secondNum = 0;
		boolean increased = false;
		boolean decreased = false;

		for (int i = 0; i < strNum.length() - 1; i++) {
			firstNum = Character.getNumericValue(strNum.charAt(i));
			secondNum = Character.getNumericValue(strNum.charAt(i + 1));
			if (firstNum < secondNum) {
				increased = true;
			} else {
				decreased = true;
			}
		}

		if (increased && !decreased) {
			System.out.println("Given number " + num + " is a Increasing number");
		} else if (!increased && decreased) {
			System.out.println("Given number " + num + " is a Decreasing number");
		} else {
			System.out.println("Given number " + num + " is a Bouncy number");
		}
	}

	public void mysteryNumber(int num) {
		int reverseNum = 0;
		boolean flag = false;
		for (int i = 1; i <= num / 2; i++) {
			reverseNum = reverseNumber(i);
			if (i + reverseNum == num) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Given number " + num + " is a Mystery number");
		} else {
			System.out.println("Given number " + num + " is not a Mystery number");
		}
	}

	public void smithNumber(int num) {
		int sumDigits = sumOfDigits(num);
		int sumPrimeFactors = 0;
		int i = 2;
		int temp = num;

		while (temp > 1) {
			if (temp % i == 0) {
				sumPrimeFactors += sumOfDigits(i);
				temp /= i;
			} else {
				do {
					i++;
				} while (!isPrimeNumber(i));
			}
		}

		if (sumDigits == sumPrimeFactors) {
			System.out.println("Given number " + num + " is a Smith number");
		} else {
			System.out.println("Given number " + num + " is not a Smith number");
		}

	}

	public int sumOfDigits(int num) {
		int sumOfDigits = 0;
		for (int temp = num; temp > 0; temp /= 10) {
			sumOfDigits += temp % 10;
		}
		return sumOfDigits;
	}

	public void strontioNumber(int num) {
		int noOfDigits = Integer.toString(num).length();
		if (noOfDigits != 4) {
			System.out.println("Please enter four digits number");
			return;
		}
		int temp = num * 2;
		if (temp % 100 / 10 == temp % 1000 / 100) {
			System.out.println("Given number " + num + " is a Strontio number");
		} else {
			System.out.println("Given number " + num + " is not a Strontio number");
		}
	}

	public void xylemAndPhloemNumber(int num) {
		int noOfDigits = Integer.toString(num).length();
		int sumOfExtrems = 0;
		int sumOfMeans = 0;
		int count = noOfDigits;

		for (int temp = num; temp > 0; temp /= 10) {
			if (count == noOfDigits || count == 1) {
				sumOfExtrems += temp % 10;
			} else {
				sumOfMeans += temp % 10;
			}
			count--;
		}

		if (sumOfExtrems == sumOfMeans) {
			System.out.println("Given number " + num + " is a Xylem number");
		} else {
			System.out.println("Given number " + num + " is a Pholem number");
		}
	}

	public void findSquareRoot(int num) {
		double t, sqrt = num / 2;
		do {
			t = sqrt;
			sqrt = (t + num / t) / 2;
		} while (t - sqrt != 0);
		System.out.println("Square root of the give num " + num + " is : " + sqrt);
	}

	public void swapNumbersUsingBitwise(int x, int y) {
		System.out.println("Before swaping x = " + x + " y = " + y);
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("After swaping x = " + x + " y = " + y);
	}

	public void swapNumbersUsingMultiDiv(int x, int y) {
		System.out.println("Before swaping x = " + x + " y = " + y);
		x = x * y;
		y = x / y;
		x = x / y;
		System.out.println("After swaping x = " + x + " y = " + y);
	}
	
	public void findGcd(int x, int y) {
		int divisor = y;
		int qus = x;
		int rem=0;
		do {
			rem = divisor%qus;
			divisor = qus;
			qus = rem;
		}while(rem > 0);
		System.out.println(divisor);
	}
	
	public int gcd(int x, int y) {
		return y == 0 ? x : gcd(y, x%y);
	}
	
	public void greatestOfThreeNum(int a, int b, int c) {
		int value = a < b ? b<c ? c : b : a<c ? c : a;
		System.out.println(value); 
	}
	
	public void smallestOfThreeNum(int a, int b, int c) {
		System.out.println(a<b ? a<c ? a:c : b<c ? b:c);
	}
	
	public void checkPosOrNeg(int num) {
		if (num<0) {
			System.out.println("Given num "+num+" is Negative");
		}else if (num>0) {
			System.out.println("Given num "+num+" is Positive");
		}else {
			System.out.println("Given num "+num+" is Zero");
		}
//		System.out.println(Math.signum(num)); ***
	}
	
	public void findEvenNumbers(int num) {
		for (int i = 1; i<=num; i++) {
			if(i%2 == 0) {
				System.out.print(i + ", ");
			}
		}
	}
	
	public void findOddNumbers(int num) {
		for (int i = 1; i<=num; i++) {
			if(i%2 != 0) {
				System.out.print(i + ", ");
			}
		}
	}
	
	public void findSumOfN(int num) {
		System.out.println(num*(num+1)/2);
	}
}
