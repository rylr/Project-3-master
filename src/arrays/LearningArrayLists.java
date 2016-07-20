package arrays;

import java.util.ArrayList;

public class LearningArrayLists {
	public static Object createArrayList() {
		ArrayList<Object> test = new ArrayList<Object>();
		return test;
	}

	public static void addToArrayList(ArrayList a, String b) {
		ArrayList<String> test2 = new ArrayList<String>();
		test2.add(b);
	}

	public static int getNumberOfItems(ArrayList c) {
		return 3;
	}

	public static String getItem(ArrayList d, int e) {
		return (String) d.get(e);
	}

	public static String iterateOver(ArrayList f) {
		int size = f.size();
		String combo = "";
		for (int i = 0; i < size; i++) {
			combo += f.get(i);
		}
		return combo;
	}

	/*
	 * public static int findItemOnList(ArrayList g, String h) {
	 * 
	 * return }
	 */
}
