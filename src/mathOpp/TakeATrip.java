package mathOpp;
import java.util.Scanner;
public class TakeATrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double distance= 2.00;
double mpg= 30.0;
double money = 100.0;
double gallon= distance/mpg;
Scanner input = new Scanner (System.in);
System.out.println("How far did you travel in total?");
distance = input.nextDouble();
System.out.println("What is the average miles per gallon of your vehicle?");
mpg= input.nextDouble();
System.out.println("How much money did you spend on gas the entire trip?");
money= input.nextDouble();
System.out.println("The amount of gallons of gas used is " + (distance/mpg) );
System.out.println("The average cost per gallon of gas is " + (money/gallon) );
	}

}
