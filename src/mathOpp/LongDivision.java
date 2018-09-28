package mathOpp;
import java.util.Scanner;
public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int dividend= 2;
int divisor = 3;
Scanner input = new Scanner (System.in);
System.out.println("What is the dividend?");
dividend= input.nextInt();
System.out.println("What is the divisor?");
divisor= input.nextInt();
System.out.println((dividend/divisor)+ "r"+ (dividend%divisor) );
	}

}
