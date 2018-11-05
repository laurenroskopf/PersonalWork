package decisionStructures;
import java.util.Scanner;
public class YouWon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double close= 0.001;
Scanner input= new Scanner(System.in);
System.out.println("How much money did you get for your fifth birthday?");
double money= input.nextDouble();
if (Math.abs(money- (Math.sqrt(84.3)))< close){
	System.out.println("You won a good prize!");
}
else{
	System.out.println("You won a bad prize...");
	}

}
}