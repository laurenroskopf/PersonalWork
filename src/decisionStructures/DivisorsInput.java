package decisionStructures;
import java.util.Scanner;
public class DivisorsInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
int divisor=0;
int divided=0;
int divisors=0;
int largest=0;
System.out.println("Enter a positive integer: ");
int number= input.nextInt();
for(divided=1; divided<=number; divided++){
for(divisor=1; divisor<=divided; divisor++){
	if(divided%divisor==0){
		divisors++;
	}
	if (divisors>=largest){
		largest=number;
	}
	
}

}
	}

}
