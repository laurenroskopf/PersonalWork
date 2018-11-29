package arrays;
import java.util.Scanner;
import java.util.Random;
public class RollADie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		Random generator= new Random();
		int[] dice= new int[10000];
		int counter= 0;
		int max=6;
		int min=1;
		for (counter=0; counter<10000; counter++){
		dice[counter]= min+ generator.nextInt(max-min+1);
		}
		System.out.println("Enter a roll number(0-9999)");
		int rolls= input.nextInt();
		System.out.println(dice[rolls]);
		while(rolls<10000){
		System.out.println("Enter a roll number(0-9999)(10000 to quit)");
		rolls= input.nextInt();
		System.out.println(dice[rolls]);}

	}

}
