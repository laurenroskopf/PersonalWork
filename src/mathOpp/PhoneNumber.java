package mathOpp;
import java.util.Scanner; 

public class PhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int areacode= 262;
int firstthree= 888;
int secondfour= 2293;
Scanner input= new Scanner (System.in);
System.out.println("What is your area code?");
areacode = input.nextInt();
System.out.println("What are the first three digits in your phone number?");
firstthree= input.nextInt();
System.out.println("What are the last four digits in your phone number?");
secondfour= input.nextInt();
System.out.println("Your phone number is "+ areacode+ ""+ firstthree+ ""+ secondfour);
System.out.println("The area code is " +areacode+ "the first three digits are "+ firstthree + " the last four digits are " + secondfour);

	}

}
