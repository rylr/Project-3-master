package stacks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class MethodTester {

	@Test
	public void test() {
		// fail("Not yet implemented");
		assertEquals("321", StacksIntro.IntegerReverse(123));
	}

	@Test
	public void test2() {
		assertEquals(16, StacksIntro.getSquarePerimeter(4));
	}

	@Test
	public void test3() {
		assertTrue(StacksIntro.isWeekend("saturday"));
		assertFalse(StacksIntro.isWeekend("monday"));
	}

	@Test
	public void test4() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		assertEquals(list, StacksIntro.genNumList(4));
	}

}
