package com.practise.interview;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Ente value in a:");
		a=s.nextInt();
		System.out.println("Enter value  in b:");
		b=s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Values in a:"+a);
		System.out.println("Values in b:"+b);
	}

}
