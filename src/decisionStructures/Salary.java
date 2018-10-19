package decisionStructures;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your salary?");
		double salary = input.nextDouble();
		if (salary < 20000) {
			System.out.println("You are a worker");
		} else {
			if (salary >= 20000 && salary < 40000) {
				System.out.println("You are management");
			} else {
				if (salary >= 40000 && salary < 100000) {
					System.out.println("You are a CEO");
				} else {
					System.out.println("You are an owner");
				}
			}
		}
	}

}
