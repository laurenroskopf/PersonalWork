package mathOpp;
import java.util.Scanner;
public class AgesOfFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int firstage = 999;
int secondage= 999;
int thirdage= 999;
Scanner input = new Scanner (System.in);
System.out.println("What is the age of the first friend?");
firstage = input.nextInt();
System.out.println("What is the age of the second friend?");
secondage= input.nextInt();
System.out.println("What is the age of the third friend?");
thirdage= input.nextInt();
System.out.println("The sum of the ages of the friends is " + (firstage + secondage + thirdage));
	}

}
