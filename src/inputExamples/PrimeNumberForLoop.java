package inputExamples;
import java.util.Scanner;
public class PrimeNumberForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number= input.nextInt();
		int prime=0;
		int divisor=0;
		for (divisor=2; divisor<number; divisor++){
		if ((number%divisor)==0){
		prime= 0;
		}
		else{
		prime=1;}
		} 
		if (prime==1){
		System.out.println("The number is prime");

	}

}
}
