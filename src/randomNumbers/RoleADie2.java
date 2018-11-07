package randomNumbers;

import java.util.Scanner;
import java.util.Random;

public class RoleADie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		System.out.println("Enter the number of times the die is rolled: ");
		double rolls = input.nextDouble();
		int max = 6;
		int min = 1;
		int counter = 0;
		double ones = 0;
		double twos = 0;
		double threes = 0;
		double fours = 0;
		double fives = 0;
		double sixes = 0;
		for (counter = 1; counter <= rolls; counter++) {
			int randomNum= min+generator.nextInt(max-min+1);
			if (randomNum == 1) {
				ones++;
			} else {
				if (randomNum == 2) {
					twos++;
				} else {
					if (randomNum == 3) {
						threes++;
					} else {
						if (randomNum == 4) {
							fours++;
						} else {
							if (randomNum == 5) {
								fives++;
							} else {
								sixes++;
							}
						}

					}
				}
			}
		}
		System.out.println("Ones rolled: "+ones+ " percentage: "+ (ones/rolls)*100);
		System.out.println("Twos rolled " + twos+ " percentage: "+ (twos/rolls)*100);
		System.out.println("Threes rolled " + threes + " percentage: " +(threes/rolls)*100);
		System.out.println("Fours rolled " +fours+ " percentage: "+ (fours/rolls)*100);
		System.out.println("Fives rolled "+ fives+ " percentage: "+ (fives/rolls)*100);
		System.out.println("Sixes rolled " + sixes+ " percentage: "+ (sixes/rolls)*100);
	}
}
