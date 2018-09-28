package mathOpp;
import java.util.Scanner;
public class VolumeofSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final double pi= 3.14;
double radius= 6.00;
Scanner input = new Scanner (System.in);
System.out.println("What is the radius of the Sphere?");
radius= input.nextDouble();
System.out.println("The area of the sphere is " + 4.0/3.0 * pi * (radius * radius * radius) );


	}

}
