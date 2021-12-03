package com.practise.interview;

public class ReverseNumber {

	public static void main(String[] args) {

		String s = "hello world!";
//		System.out.println(s.length());
//		for (int i = 0; i < s.length(); i++) {
//			System.out.print(s.charAt(i));
//		}
//		
//		
//		System.out.println("----------------");
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
//System.out.println(s.isEmpty());
//System.out.println(s.replace('e', 'a'));
	}

}


