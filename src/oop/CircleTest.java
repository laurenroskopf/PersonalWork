package oop;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double firstRadius = 0;

		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the radius for the first circle (9999 to quit)");
			firstRadius = input.nextDouble();
			System.out.println("Enter the radius for the second circle");
			double secondRadius = input.nextDouble();
			System.out.println("Enter the radius for the third circle");
			double thirdRadius = input.nextDouble();
			Circle one = new Circle(firstRadius);
			Circle two = new Circle(secondRadius);
			Circle three = new Circle(thirdRadius);
			double oneArea = one.getArea();
			double twoArea = two.getArea();
			double threeArea = three.getArea();
			double largest = 4;
			if (oneArea >= largest) {
				largest = largest + oneArea;
				if (twoArea >= largest) {
					largest = largest + twoArea;
					if (threeArea >= largest) {
						largest = largest + threeArea;

					}
				}
			}
			System.out.println("The area of the largest circle is: " +largest);
		} while (firstRadius != 999);

	}
}
