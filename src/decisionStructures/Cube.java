package decisionStructures;
import java.util.Scanner;
public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.println("Enter a number: ");
int number= input.nextInt();
while(number!=-1){
	System.out.println("The cube of that number is " + (number*number*number));
	System.out.println("Enter a number: ");
	number= input.nextInt();
}
	}

}
