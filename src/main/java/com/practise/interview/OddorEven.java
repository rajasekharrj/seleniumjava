package com.practise.interview;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any num:");
		n = s.nextInt();
		if (n % 2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("odd number");
		}
	}

}
