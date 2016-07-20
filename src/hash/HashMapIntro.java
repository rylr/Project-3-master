package hash;

import java.util.HashMap;

public class HashMapIntro {
	public static void main(String[] args) {
		HashMap <String, Integer> kids = new HashMap<String, Integer>();
		kids.put("Kevin", 235);
		System.out.println(kids.get("Kevin")); //Searches for key(Kevin) and outputs the value(235) 
	}
}
