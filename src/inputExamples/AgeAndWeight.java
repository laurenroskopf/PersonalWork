package inputExamples;
import java.util.Scanner;
public class AgeAndWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age= 99;
int weight= 9999;
Scanner input = new Scanner (System.in); 
System.out.println("How old are you?");
age= input.nextInt();
System.out.println("I am " + age+ " years old");
System.out.println("How much do you weigh?");
weight= input.nextInt();
System.out.println("I weigh " + weight+ " pounds");
	}

}
