package decisionStructures;
import java.util.Scanner;
public class ClassAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		double students=0;
		int scores=0;
		double score=0;
		double sum=0;
		System.out.println("How many students are in the class?");
		students= input.nextDouble();
		for(scores=1; scores<=students; scores++){
		System.out.println("Enter a test score: ");
		score=input.nextDouble();
		sum=sum+score;}
		System.out.println("The average test score is: " + (sum/students));

	}

}
