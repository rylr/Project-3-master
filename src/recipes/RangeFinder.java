package recipes;

import java.util.Scanner;

public class RangeFinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sent = 0;
		int value, small, large;
		
		System.out.println("This program finds the largest and smallest numbers.");
		System.out.println("Please enter " + sent + " to display the smallest and largeset values.");
		
		System.out.print("?  ");
		value = input.nextInt();
		small = value;
		large = value;
		
		if(value == sent) {
			System.out.println("No smallest or largest values have been entered.");
			System.exit(1);
		}
			
		while(value != sent) {
			System.out.print("?  ");
			value = input.nextInt();
			
			if(value > large)
				large = value;
			else if(value < small)
				small = value;
			
			if(value == sent) {
				System.out.println("Smallest:  " + small);
				System.out.println("Largest:   " + large);
			}
		}
	}
}
