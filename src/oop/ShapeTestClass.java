package oop;
import java.util.Scanner;
public class ShapeTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
Rectangle one= new Rectangle();
Circle two= new Circle();
RightTriangle three= new RightTriangle();
Trapezoid four= new Trapezoid();
System.out.println("What is the length the rectangle?");
double length= input.nextDouble();
System.out.println("What is the width of the rectangle?");
double width= input.nextDouble();
System.out.println("What is the radius of the circle?");
double radius= input.nextDouble();
System.out.println("What is the base of the right triangle");
double base= input.nextDouble();
System.out.println("What is the height of the right triangle");
double height= input.nextDouble();
System.out.println("What is the length of base 1 of the trapezoid?");
double base1=input.nextDouble();
System.out.println("What is the length of base 2 of the trapezoid?");
double base2= input.nextDouble();
System.out.println("What is the height of the trapezoid?");
double heightT= input.nextDouble();
System.out.println("What is the length of the leg of the trapezoid?");
double leg= input.nextDouble();
System.out.println("Rectangle Area: "+one.getArea());
System.out.println("Rectangle Perimeter: "+one.getPerimeter());
System.out.println("Circle area: "+two.getArea());
System.out.println("Circle circumference: "+two.getCircumfrence());
System.out.println("Right Triangle area: " +three.area());
System.out.println("Right Triangle perimeter: "+three.perimeter());
System.out.println("Trapezoid area" +four.area());
System.out.println("Trapezoid perimeter: "+four.perimeter());
}

}
