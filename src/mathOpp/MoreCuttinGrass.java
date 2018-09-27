package mathOpp;
import java.util.Scanner;
public class MoreCuttinGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double width= 1;
double length= 1;
double radius= 1;
Scanner input= new Scanner(System.in);
System.out.println("What is the width of the lawn?");
width= input.nextDouble();
System.out.println("What is the length of the lawn?");
length= input.nextDouble();
System.out.println("What is the radius of the fountain?");
radius= input.nextDouble();
double area= (width*length - (3.14*(radius*radius)));
System.out.println("The money owed for cutting the grass is"+ area/100 *1.25);
	}

}
