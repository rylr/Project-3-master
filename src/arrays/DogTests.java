package arrays;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class DogTests {

	@Test
	public void test1() {
		String s = "My dog has fleas";
		String[] s2 = { "My", "dog", "has", "fleas" };
		assertArrayEquals(s2, createWordList(s));
	}

	@Test
	public void test2() {
		String s = "My dog has fleas";
		String[] s2 = { "dog", "fleas", "has", "my" };
		assertArrayEquals(s2, createSortedWordList(s));
	}

	public static String[] createWordList(String x) {
		int length = x.length();
		String blank = "";
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < length; i++) {
			if (x.charAt(i) == ' ') {
				list.add(blank);
				System.out.println(blank);
				blank = "";
			} else if (i == length - 1) {
				blank += x.charAt(i);
				list.add(blank);
				System.out.println(blank);
			} else {
				blank += x.charAt(i);
			}
		}
		String[] array = new String[list.size()];
		list.toArray(array);
		System.out.println(array);
		return array;
	}

	public static String[] createSortedWordList(String x) {
		int length = x.length();
		String blank = "";
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < length; i++) {
			if (x.charAt(i) == ' ') {
				list.add(blank);
				System.out.println(blank);
				blank = "";
			} else if (i == length - 1) {
				blank += x.charAt(i);
				list.add(blank);
				System.out.println(blank);
			} else {
				blank += x.charAt(i);
			}
		}
		Collections.sort(list);
		String[] array = new String[list.size()];
		list.toArray(array);
		System.out.println(array);
		return array;
	}

}
