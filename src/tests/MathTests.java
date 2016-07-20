package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathTests {

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(Math.sin(60), parseTrigFunction("sin(60)"), 0);
		assertEquals(Math.cos(45), parseTrigFunction("cos(45)"), 0);
		assertEquals(Math.tan(0.5), parseTrigFunction("tan(0.5)"), 0);
	}

	public double parseTrigFunction(String s) {
		String a = "";
		double x = 0;
		for(int i = 0; i < s.length() - 1; i++) {
			if(s.charAt(i) == '(') {
				while(s.charAt(i + 1) != ')') {
					a += s.charAt(i + 1);
					i++;
				}
			}
		}
		
		if(s.contains("sin")) {
			x = Math.sin(Double.parseDouble(a));
		}
		else if(s.contains("cos")) {
			x = Math.cos(Double.parseDouble(a));
		}
		else if(s.contains("tan")) {
			System.out.println(a);
			x = Math.tan(Double.parseDouble(a));
		}
			
		return x;
	}

}
