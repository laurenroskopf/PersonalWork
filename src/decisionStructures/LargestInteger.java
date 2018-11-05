package decisionStructures;
import java.util.Scanner;
public class LargestInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.println("What is the first number?");
int one= input.nextInt();
System.out.println("What is the second number?");
int two= input.nextInt();
System.out.println("What is the third number?");
int three= input.nextInt();
if (one > two && one > three){
System.out.println(one+ " is the largest number");
}
if (two> one && two > three){
System.out.println(two+ " is the largest number" );

}
if (three > one && three> two){
System.out.println(three+ " is the largest number");
	}}}
