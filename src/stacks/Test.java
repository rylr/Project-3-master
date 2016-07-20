package stacks;

import static org.junit.Assert.assertEquals;

public class Test {

	@org.junit.Test
	public void test() {
		// fail("Not yet implemented");
		int z = add(4, 6);
		System.out.println(z);

		assertEquals(10, z);
	}

	public int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

}
