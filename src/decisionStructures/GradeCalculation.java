package decisionStructures;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your test average?");
		double test = input.nextDouble();
		System.out.println("What is your homework average?");
		double homework = input.nextDouble();
		System.out.println("True or false: you have a nice teacher");
		boolean teacher = input.nextBoolean();
		if (teacher == true) {
			if (test > homework) {
				System.out.println("Your grade is " + test+ " percent");
			} else {
				System.out.println("Your grade is " + homework+ " percent");
			}
		}
		if (teacher == false) {
			if (test > homework) {
				System.out.println("Your grade is " + homework + " percent");
			} else {
				System.out.println("You grade is " + test +" percent");
			}
		}
	}
}
