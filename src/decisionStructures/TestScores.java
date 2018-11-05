package decisionStructures;
import java.util.Scanner;
public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.println("What is the first test score?");
double firstscore= input.nextDouble();
System.out.println("What is the second test score?");
double secondscore=input.nextDouble();
if (firstscore> secondscore)
{ 
	System.out.println("Great job!");
System.out.println(firstscore- secondscore);
}
System.out.println("Have a nice day!");
	}

}
