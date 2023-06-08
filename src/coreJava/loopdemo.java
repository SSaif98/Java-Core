package coreJava;

import Arrays.ArrayDemo;

public class loopdemo {

	public static void main(String[] args) {

		ArrayDemo ad= new ArrayDemo();
		ad.getData(); 
		// WhileLoop

		/*
		 * while(boolean expression){ }
		 */
		// print number 1-10
		int i = 1;
		while (i <= 10) {

			System.out.println(i);
			i++;
		}
		// print number 10-1
		int j = 10;
		while (j >= 1) {
			System.out.println(j);
			j--;
		}

		// Do-While
		// In do while loop for the first time loop will execute always as it do not
		// have any condition to evaluate in start
		int k = 1;
		do {
			System.out.println(k);
			k++;
		} while (k <= 10);
		System.out.println(k);

		// FOR -IF
		for (int l = 1; l <= 10; l++) {
			if (l == 2) {
				System.out.println("Pass#" + l);
			} else {
				System.out.println("Fail#" + l);
			}
		}

		// NESTED LOOPS

		/* outer for loop */ for (int o = 1; o <= 4; o++) {

			System.out.println("Outer Loop Start: " + o);

			for (int m = 1; m <= 4; m++) { // inner loop
				System.out.println("Inner Loop: " + m);
			}
			System.out.println("Outer Loop Finished "+o);
		}

	}
}