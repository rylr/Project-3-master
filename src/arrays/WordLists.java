package arrays;

public class WordLists {
	public static void main(String[] args) {
		createWordList("My dog has fleas");
	}

	public static String[] createWordList(String x) {
		String m = "Mississippi";
		String[] m2 = m.split("i");
		for (int i = 0; i < m2.size(); i++) {
			System.out.println(m2[i]);
		}
	}
}
