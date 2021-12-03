package com.practise.interview;

public class DuplicateNumbers {

	public static void main(String[] args) {
		
		int a[]= {1,2,5,6,1,7,2};
		for(int i=0;i<a.length;i++) 
			for(int j=i+1;j<a.length;j++) 
				
				if(a[i]==a[j] ) {
					System.out.println("duplicate found at" +j);
					
				}
			
		

	}

}
