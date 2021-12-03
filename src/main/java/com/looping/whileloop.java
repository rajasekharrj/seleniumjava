package com.looping;

public class whileloop {

	public static void main(String[] args) {
		int amount = 10000;
		while (amount > 0) {
			System.out.println(amount);
			amount -= 2000;
		}
		int a = 1;
		while (a < 5) {
			System.out.println(a);
			a++;
		}
		int i = 1;
		while (i < 5) {
			int j = 1;
			while (j < 5) {
				System.out.println(i + "*" + j + "=" + (i * j));
				j++;
			}
			
			System.out.println();
			i++;
		}
	}

}
