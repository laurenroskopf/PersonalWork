package stings;
import java.util.Scanner;
public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.println("Enter your age");
int age= input.nextInt();
input.nextLine();
System.out.println("Enter your name");
String name= input.next();
System.out.println("Your age is: " + age);
System.out.println("Your name is: "+ name);

	}

}
