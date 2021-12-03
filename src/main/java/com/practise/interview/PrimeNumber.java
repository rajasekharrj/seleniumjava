package com.practise.interview;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n,fact=1;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter any num:      ");
		n=s.nextInt();
		if(n==1) {
			System.out.println("smallest prime no is 2");
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("is not prime num   ");
				break;
			}
			if(n==i) {
				System.out.println("is prime num");
			}
		}
		

	}

}
