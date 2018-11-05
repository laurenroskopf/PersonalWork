package decisionStructures;

import java.util.Scanner;

public class Honors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What year are you graduating?");
		double year = input.nextDouble();
		System.out.println("What is your GPA?");
		double gpa = input.nextDouble();

		if (year == 2019.0 && gpa >= 3.5) {
			System.out.println("You graduate with honors!");
		} else {
			System.out.println("You don't graduate with honors");

		}
	}
}
