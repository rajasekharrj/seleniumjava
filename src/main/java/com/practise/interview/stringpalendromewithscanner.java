package com.practise.interview;



public class stringpalendromewithscanner {

	public static void main(String[] args) {

String s="malayalam";
StringBuffer sb=new StringBuffer();
for(int i=s.length()-1;i>=0;i--) {
	sb.append(s.charAt(i));
}



System.out.println(s);
System.out.println(sb);
String s1=new String(sb);

if(s.equals(s1)) {
	System.out.println("Entered string is palendrome     ");
}else {
	System.out.println("Entered string is not palendrome    ");
}

	}

}
