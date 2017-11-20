package com.testpackage;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inputDigitScanner = new Scanner(System.in);
		System.out.print("Введите целое число:");
		int digit = inputDigitScanner.nextInt();
		for (int i = 1; i < digit; i++) {
			if (isPalindrom(i)) {
				System.out.print(i + " ");
			}
		}
	}

	private static boolean isPalindrom(int number) {
		boolean isPalindrom = true;
		String digitString = String.valueOf(number);
		int length = digitString.length();

		for (int i = 0; i <= length / 2; i++) {
			if (digitString.charAt(i) != digitString.charAt(length - 1 - i)) {
				isPalindrom = false;
				break;
			}
		}

		return isPalindrom;
	}
}
