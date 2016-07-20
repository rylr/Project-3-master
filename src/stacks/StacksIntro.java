package stacks;

import java.util.ArrayList;
import java.util.Stack;

public class StacksIntro {
	public static void main(String[] args) {

		/*
		 * Stack<Integer> first = new Stack<Integer>(); first.push(1); first.push(6); first.push(328); int size =
		 * first.size(); for (int i = 0; i < size; i++) System.out.println(first.pop());
		 */

		StacksIntro r = new StacksIntro();
		IntegerReverse(123);

	}

	public StacksIntro() {
		String x = "Hello";
		// String z = StringReverse(x);
		// System.out.println(z);
	}

	public static String StringReverse(String s) {
		Stack<Character> reverse = new Stack<Character>();
		String y = "";
		int size = s.length();
		for (int i = 0; i < size; i++) {
			reverse.push(s.charAt(i));
		}
		for (int i = 0; i < size; i++) {
			y += reverse.pop();
		}

		return y;

	}

	public static String IntegerReverse(int x) {
		Stack<Character> flip = new Stack<Character>();
		String y = x + "";
		String z = "";
		int size = y.length();
		for (int i = 0; i < size; i++) {
			flip.push(y.charAt(i));
		}
		for (int i = 0; i < size; i++) {
			z += flip.pop();
		}

		// int z = Integer.parseInt(y);
		return z;
	}

	public static int getSquarePerimeter(int length) {
		int perimeter = length * 4;
		return perimeter;
	}

	public static boolean isWeekend(String dayOfWeek) {
		boolean weekend;
		if (dayOfWeek.equals("saturday") || dayOfWeek.contains("sunday")) {
			weekend = true;
		} else {
			weekend = false;
		}

		return weekend;
	}

	public static ArrayList<Integer> genNumList(int x) {
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		for (int i = 0; i < x; i++) {
			list2.add(i);
		}

		return list2;
	}
}
