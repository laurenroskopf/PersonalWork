package decisionStructures;
import java.util.Scanner;
public class TestScores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.println("Enter a test score: ");
int score= input.nextInt();
int sum=0;
int number=0;
while (score!=9999){
	sum= sum+score;
	number++;
	System.out.println("Enter a test score(9999 to quit):");
score= input.nextInt();}
System.out.println("The sum of the test scores is: " + sum);
System.out.println("The average of the test scores is " + sum/number);
	}

}
