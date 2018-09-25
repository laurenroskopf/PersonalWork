package mathOpp;
import java.util.Scanner;
public class LetsPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final double height= 8.0;
double width= 60.0;
double length= 17.0;
double wallone= (height*width);
double walltwo= (height*length);
Scanner input= new Scanner (System.in);
System.out.println("What is the width of the room?");
width= input.nextDouble();
System.out.println("What is the length of the room?");
length= input.nextDouble();
System.out.println("The amount of paint needed to paint the room is "+ ((wallone*2) + (walltwo*2)) /150 + " gallons");
	}

}
