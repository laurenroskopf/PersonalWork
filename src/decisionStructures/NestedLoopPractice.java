package decisionStructures;
import java.util.Scanner;
public class NestedLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.println("Enter a positive integer");
int num= input.nextInt();
int divisor=0;
int divisors=0;
while(num!=9999){
	for(divisor=2; divisor<num;divisor+=2){
		if (num%divisor==0){
			divisors= divisors+ divisor;
		}
	}
	System.out.println("The sum of the divisors is " + divisors);
	divisors=0;
	System.out.println("Enter a positive integer(9999 to quit)");
num=input.nextInt();
}
	}

}
