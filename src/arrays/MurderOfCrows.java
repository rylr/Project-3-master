package arrays;

import java.util.ArrayList;
import java.util.Random;

public class MurderOfCrows {

	ArrayList<Crow> theMurder = new ArrayList<Crow>();

	public static void main(String[] args) {
		MurderOfCrows murderOfCrows = new MurderOfCrows();
		murderOfCrows.initializeCrows();
		murderOfCrows.findTheDiamond();
	}

	private void findTheDiamond() {
		/*
		 * 1. One of the Crows has eaten the diamond. You need to search through the stomach of each Crow, then print
		 * the name of the guilty Crow.
		 */
		int crowNum = 0;
		for (Crow c : theMurder) {
			crowNum++;
			for (String s : c.getStomachContents()) {
				if (s.equals("Diamond")) {
					System.out.println(c.getName());
					System.out.println(crowNum + " crows had to die before the diamond was found.");
				}
			}
		}
		/* 2. How many innocent crows had to die before the diamond was found? */
	}

	private void initializeCrows() {
		theMurder.add(new Crow("Rok"));
		theMurder.add(new Crow("Merle"));
		theMurder.add(new Crow("Poe"));
		theMurder.add(new Crow("Grenwyn"));
		theMurder.add(new Crow("Crawford"));
		hideTheDiamond();
	}

	private void hideTheDiamond() {
		int randomness = new Random().nextInt(theMurder.size());
		theMurder.get(randomness).getStomachContents().add("Diamond");
	}
}

class Crow {
	private String name;
	private ArrayList<String> stomachContents = new ArrayList<String>();

	public Crow(String name) {
		this.name = name;
		fillCrowsStomach();
	}

	private void fillCrowsStomach() {
		for (int i = 0; i < 10; i++)
			this.stomachContents.add(getRandomCrowFood());
	}

	private String getRandomCrowFood() {
		int randomness = new Random().nextInt(4);
		if (randomness == 0)
			return "Carrion";
		else if (randomness == 1)
			return "Snail";
		else if (randomness == 2)
			return "Acorn";
		else if (randomness == 3)
			return "Spider";
		else
			return "Grub";
	}

	public String getName() {
		return name;
	}

	public ArrayList<String> getStomachContents() {
		return stomachContents;
	}
}