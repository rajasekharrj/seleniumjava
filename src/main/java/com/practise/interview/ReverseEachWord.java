package com.practise.interview;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s="i love java programming";
		//System.out.print(s.length());
		//System.out.print(s);
		String words[]=s.split(" ");
		for(int i=0;i<words.length;i++) {
			for(int j=words[i].length()-1;j>=0;j--) {
				System.out.print(words[i].charAt(j));
			}
			System.out.print(" ");
		}

	}

}
