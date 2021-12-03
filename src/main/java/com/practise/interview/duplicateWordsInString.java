package com.practise.interview;

public class duplicateWordsInString {

	public static void main(String[] args) {
		
		String s="hi java programmer hi java tester";
		String word[]=s.split(" ");
		for(int i=word.length-1;i>=0;i--) {
			for(int j=i-1;j>=0;j--) {
				if(word[i].equals(word[j])) {
					
					System.out.println("found duplicate at" +  word[j]);
				}
			}
		}

	}

}
