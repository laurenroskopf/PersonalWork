package arrays;
import java.util.Random;
public class TwoDimensionalPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator= new Random();
		int counter=0;
		int row=0;
		int column=0;
		int max= 100;
		int min=0;
int[][]practice= new int[14][9];
for(row=0;row<14; row++){
	for (column=0; column<9; column++){
		int randomnum= min+generator.nextInt(max-min+1);
		practice[row][column]=randomnum;}
}
	
	for(row=0;row<14; row++){
		for (column=0; column<9; column++){
			System.out.print(practice[row][column]+ " ");
		
}System.out.println();
}
	}
}