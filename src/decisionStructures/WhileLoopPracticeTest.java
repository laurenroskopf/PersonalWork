package decisionStructures;
import java.util.Scanner;
import java.util.Random;
public class WhileLoopPracticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter a integer(0-1000)");
int num= input.nextInt();
int count=0;
Random one= new Random();
int randomnum= one.nextInt(1000);
while(num!= randomnum){
	if(num>randomnum){
		System.out.println("Too big, guess again");
	}
	else{
		System.out.println("Too small guess again");
		
	}
	count++;
	System.out.println("enter a number");
	num= input.nextInt();
	
	}
System.out.println("You won!");
System.out.println("guesses: "+count);
}
	

}

