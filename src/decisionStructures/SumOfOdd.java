package decisionStructures;
import java.util.Scanner;
public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int number=0;
		System.out.println("Enter a positive integer: ");
		number= input.nextInt();
		int sum=0;
		int oddint=0;
		for(oddint=1; oddint<= number; oddint+=2){
		sum=sum+oddint;}
		System.out.println(sum);

	}

}
