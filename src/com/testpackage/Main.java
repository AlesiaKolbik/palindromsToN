package com.testpackage;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inputDigitScanner = new Scanner(System.in);
		System.out.print("Введите целое число:");
		int digit = inputDigitScanner.nextInt();
		for (int i = 1; i < digit; i++) {
			if (i >= 1 && i <= 9) {
				System.out.print(i+" ");
				continue;
			} else {
				String digitString = String.valueOf(i);
				String digitInvers = new String();
				for (int j = digitString.length() - 1; j >= 0; j--) {
					digitInvers += digitString.charAt(j);
				}
				if (digitString.equals(digitInvers))
					System.out.print(i+" ");
			}
		}
	}
}
