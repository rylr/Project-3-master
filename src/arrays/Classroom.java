package arrays;

import java.util.ArrayList;

public class Classroom {
	ArrayList<Student> kids = new ArrayList<Student>();

	public static void main(String[] args) {
		Classroom c = new Classroom();
	}

	public Classroom() {
		kids.add(new Student(10, "Tyler"));
		kids.add(new Student(12, "Billy"));
		kids.add(new Student(6, "Joe"));
		kids.add(new Student(8, "Mike"));
		kids.add(new Student(7, "Jim"));

		float average = getAverageIQ();
		System.out.println(average);
	}

	public float getAverageIQ() {
		int totalIntel = 0;
		for (Student s : kids)
			totalIntel += s.getIntel();
		float averageIntel = totalIntel / 5f;
		return averageIntel;
	}
}
