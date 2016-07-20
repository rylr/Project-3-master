package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class Recursion {
	
	@Test
		public void testFactorial() {
			assertEquals(2, factorial(2));
			assertEquals(6, factorial(3));
			assertEquals(24, factorial(4));
			assertEquals(120, factorial(5));
		}
	
	@Test
		public void testFibonacci() {
			assertEquals(0, getFibonacci(0));
			assertEquals(1, getFibonacci(1));
			assertEquals(1, getFibonacci(2));
			assertEquals(2, getFibonacci(3));
			assertEquals(3, getFibonacci(4));
			assertEquals(5, getFibonacci(5));
			assertEquals(8, getFibonacci(6));
			assertEquals(13, getFibonacci(7));
		}
	
	
		private int factorial(int x) {
			if(x == 1)
				return x;
			else
				return x * factorial(x-1);
		}
		
		private int getFibonacci(int term) {
			int value = 1; 
			
			if(term <= 1)
				return term;
			else {
				value = getFibonacci(term - 1) + getFibonacci(term - 2);
			}
			
			/*
			int first = 0;
			int second = 1;
			int third = 1;
			for(int i = 0; i <= term; i++) {
				System.out.println(third);
				
				third = first + second;
				first = second;
				second = third;
			}
			*/
			return value;
		}
		
}
