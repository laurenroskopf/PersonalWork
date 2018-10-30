package decisionStructures;
import java.util.Scanner;
public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
System.out.println("Enter a test score: ");
int score= input.nextInt();
int largest=0;
int smallest=100;
while(score!=9999){
	if (score>=largest){
		largest= score;
	}
	if (score<=smallest){
		smallest= score;
	}
	System.out.println("Enter a test score: (9999 to quit) ");
score= input.nextInt();}
System.out.println("The smallest score is: "+ smallest);
System.out.println("The largest score is: " +largest);
	}

}
