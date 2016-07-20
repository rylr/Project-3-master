package arrays;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListPuzzles {
	public static void main(String[] args) {
		//Dinner Decider
		ArrayList<String> foods = new ArrayList<String>();
		foods.add("pizza");
		foods.add("burger");
		foods.add("berries");
		System.out.println(foods.get(new Random().nextInt(3)));
		
		//ComedyCentral
		ArrayList<String> jokes = new ArrayList<String>();
		ArrayList<String> punchlines = new ArrayList<String>();
		jokes.add("Why did the chicken cross the road?");
		punchlines.add("dfasdf");
		jokes.add("Why did tjei");
		punchlines.add("asdf");
		int ran = new Random().nextInt(2);
		System.out.println(jokes.get(ran));
		System.out.println(punchlines.get(ran));
		
		//Band name Generator
		ArrayList<String> adj = new ArrayList<String>();
		ArrayList<String> noun = new ArrayList<String>();
		adj.add("slimy");
		adj.add("stupid");
		noun.add("people");
		noun.add("pointers");
		
	}
}
