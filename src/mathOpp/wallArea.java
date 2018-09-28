package mathOpp;
import java.util.Scanner;
public class wallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int width = 999;
Scanner input = new Scanner (System.in);
System.out.println("What is the width of the wall?");
width = input.nextInt();
System.out.println("The area of the wall is " + (width * 8)+ " square feet");

	}

}
