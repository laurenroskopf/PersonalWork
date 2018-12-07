package arrays;

import java.util.Random;

public class ThreeDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int min = 0;
		int max = 50;
		int[][][] lauren = new int[3][7][9];
		for (int row = 0; row <= 3; row++) {
			for (int column = 0; column <= 7; column++) {
				for (int element = 0; element <= 9; element++) {
					int randomnum = min + generator.nextInt(max - min + 1);
					lauren[row][column][element] = randomnum;
				}
			}
		}
	}

}
