package decisionStructures;

import java.util.Scanner;

public class CuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the width of the front yard?");
		double width = input.nextDouble();
		System.out.println("What is the length of the front yard?");
		double length = input.nextDouble();
		System.out.println("True or false: you cut the backyard");
		boolean backyard = input.nextBoolean();
		double frontyard = (length * width);
		double radius = 0;
		if (backyard = true) {
			System.out.println("What is the radius of the backyard?");
			radius = input.nextDouble();
			System.out.println("You earn " + ((frontyard / 100) + ((radius / 75) * 1.5)) + " dollars");
		} else {
			System.out.println("You earn " + frontyard / 100);
		}

	}

}
