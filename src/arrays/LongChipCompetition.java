package arrays;

import java.util.ArrayList;
import java.util.Random;

public class LongChipCompetition {

	/**
	 * The Beatles are eating lunch and playing a game to see who has the longest chip. (In England, french fries are
	 * called "chips".)
	 * 
	 * Find the Beatle with the longest chip. You may not edit the Chip or Beatle classes. Make sure to initialize The
	 * Beatles before you start your search.
	 * 
	 * @return
	 * 
	 **/
	public static void main(String[] args) {
		LongChipCompetition l = new LongChipCompetition();

		l.initializeBeatles();
		double largest = 0;
		String owner = null;
		for (Beatle b : l.theBeatles) {
			for (Chip c : b.getChips()) {
				if (c.getLength() > largest) {
					largest = c.getLength();
					owner = b.getName();
				}
			}
		}
		System.out.println(owner + "'s chip was longest with length " + largest);
	}

	private ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();

	private void initializeBeatles() {
		Beatle george = new Beatle("George");
		Beatle john = new Beatle("John");
		Beatle paul = new Beatle("Paul");
		Beatle ringo = new Beatle("Ringo");

		theBeatles.add(george);
		theBeatles.add(john);
		theBeatles.add(paul);
		theBeatles.add(ringo);
	}
}

class Beatle {
	private String name;
	private ArrayList<Chip> chips = new ArrayList<Chip>();

	public Beatle(String name) {
		this.name = name;
		initializePlateOfChips();
	}

	private void initializePlateOfChips() {
		int numberOfChips = new Random().nextInt(100);
		for (int i = 0; i < numberOfChips; i++) {
			chips.add(new Chip(new Random().nextDouble() * 10));
			if (this.name.contains("in"))
				chips.add(new Chip(10));
		}
	}

	public ArrayList<Chip> getChips() {
		return this.chips;
	}

	public String getName() {
		return this.name;
	}

}

class Chip {
	private double length;

	public double getLength() {
		return length;
	}

	Chip(double d) {
		this.length = d;
	}
}