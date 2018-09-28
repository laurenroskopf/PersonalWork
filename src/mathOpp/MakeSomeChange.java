package mathOpp;
import java.util.Scanner;
public class MakeSomeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final double dollars= 1.00;
final double quarters = .25;
final double dimes= .10;
final double nickels= .05;
final double pennies= .01;
double amount= 0.00;
double dollarsam= amount%dollars;
Scanner input= new Scanner(System.in);
System.out.println("What is the value that you want change for? In the form 0.00");
amount= input.nextDouble();
System.out.println("Your change is "+ dollarsam + "dollars");

	}

}
