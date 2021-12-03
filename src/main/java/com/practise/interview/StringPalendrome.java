package com.practise.interview;

public class StringPalendrome {

	public static void main(String[] args) {
		String s = "malayalam";
		StringBuilder sb = new StringBuilder();

		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));

		}
		System.out.println(s);
		System.out.println(sb);
String s1=new String(sb);
if(s.equals(s1)) {
	System.out.println("given string is palendrome");
}else {
	System.out.println("given string is not palendrome");
}
	}

}
