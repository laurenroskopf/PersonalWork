package decisionStructures;
import java.util.Scanner;
public class SumTheNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.println("What is the first number?");
int first= input.nextInt();

do{ System.out.println("What is the second number?");
int second= input.nextInt();
	System.out.println("The sum of the numbers is " + (first+second));
	System.out.println("What is the first number?");
	first= input.nextInt();

}while (first != 999);
	}

}
