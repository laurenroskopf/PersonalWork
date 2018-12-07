package arrays;
import java.util.Scanner;
import java.util.Random;
public class RollADieMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		Random generator= new Random();
		System.out.println("Enter the number of students in the class");
		int students= input.nextInt();
		System.out.println("Enter the number of sides on the die");
		int sides= input.nextInt();
		System.out.println("Enter how many times each student rolls the die");
		int times= input.nextInt();
		int min= 1;
		int max=sides;
		int[][]room=new int[students][times];
		System.out.println("Enter a number");
		int number= input.nextInt();
		int numbernumber=0;
		for(int xstudents=0; xstudents<students; xstudents++){
		for(int xtimes=0; xtimes<times; xtimes++){
		room[xstudents][xtimes]=(min+generator.nextInt(max-min+1));
		if (room[xstudents][xtimes]==number){
		numbernumber++;
		}

		}
		for(int ystudents=0; ystudents<students; ystudents++){
		for(int ytimes=0; ytimes<times; ytimes++){
		System.out.print(room[ystudents][ytimes]);
	
		}System.out.println();
		}
		

	}

}}
