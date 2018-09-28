package mathOpp;
import java.util.Scanner;
public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age= 999;
Scanner input = new Scanner (System.in);
System.out.println("Enter you age");
age= input.nextInt();
System.out.println("It will be " + (18 - age) + "years until you can vote");
	}

}
