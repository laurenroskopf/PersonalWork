package mathOpp;
import java.util.Scanner;
public class SpeedLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final int onemile= 55;
final int twomiles= 40;
int milesover= 6;
Scanner input= new Scanner (System.in);
System.out.println("How many miles over the speed limit were you going");
milesover= input.nextInt();
System.out.println("Your speeding ticket will be " + (40 * (milesover - 1)+ 55)+" dollars");
	}

}
