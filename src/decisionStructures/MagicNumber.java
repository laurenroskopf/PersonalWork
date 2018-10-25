package decisionStructures;
import java.util.Scanner;
public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
int largest= 0;
int smallest=1000000000;
System.out.println("Enter a number");
int number= input.nextInt();
if (number> largest){
	number=largest;}
if (number<smallest){
number= smallest;
}
do {
	if (number>largest){
		number= largest;
	}
	if (number>smallest){
		number=smallest;
	}
	System.out.println("Enter a number (9999 to quit)");
	number= input.nextInt();
	} 
while (number <9999 && number>9999);
System.out.println("The range is "+ (largest-smallest));
	}

}
