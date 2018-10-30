package decisionStructures;
import java.util.Scanner;
public class Countby5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.println("Enter a number: ");
int number= input.nextInt();
int output=0;
while (output<=number-5){
output=output+5;
System.out.println(output);
	}

}}
