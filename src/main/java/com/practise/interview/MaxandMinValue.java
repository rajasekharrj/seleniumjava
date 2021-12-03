package com.practise.interview;

public class MaxandMinValue {

	public static void main(String[] args) {
		int a[] = { 5, 7, -4, 99, 32, 3 };
		int min = a[0];
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
			if (a[i] > max) {
				max = a[i];
			}

		}
		System.out.println("minimum is  " + min);
		System.out.println("maximum is   " + max);
	}
}