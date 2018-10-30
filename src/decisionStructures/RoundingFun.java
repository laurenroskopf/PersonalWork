package decisionStructures;
import java.util.Scanner;
public class RoundingFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		int number= 0;
		double rounded=0;
		System.out.println("Enter a number: ");
		number= input.nextInt();
		while(number!=999){
		rounded= Math.round(number/100);
		rounded = rounded*100;
		System.out.println(rounded);
		System.out.println("Enter a number: (999 to quit)");
		number= input.nextInt();
		}

	}

}
