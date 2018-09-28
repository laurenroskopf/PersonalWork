package mathOpp;
import java.util.Scanner;
public class SocialSecurityNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=12;
int ssn= 222222222;
int lastfour= 2222;
Scanner input= new Scanner (System.in);
System.out.println("How old are you?");
age= input.nextInt();
System.out.println("What is your social security number?");
ssn= input.nextInt();
System.out.println("What are the last 4 digits of your Social Security Number");
lastfour= input.nextInt();
System.out.println("Years until you turn 18:" + (18 - age));
System.out.println("Your social security number is " + ssn);
System.out.println("Your last four numbers of your social security number are:" + lastfour);
input.close();
	}

}
