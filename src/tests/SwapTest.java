package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class SwapTest {
	
	@Test
	public void swap() {
		assertEquals("shcool", swap("school", 1, 2));
	}
	
	private String swap(String before, int start, int end) {
		String after = "";
		char hold;
		char beforeArray[] = before.toCharArray();
		
		hold = beforeArray[start];
		beforeArray[start] = beforeArray[end];
		beforeArray[end] = hold;
		
		System.out.println(hold);
		System.out.println(beforeArray);
		System.out.println(after);
		
		after = new String(beforeArray);
		
		return after;
	}
}
