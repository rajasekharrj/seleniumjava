package com.practise.interview;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n, fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any num      ");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}System.out.println("factorial is" +fact);
	}

}
