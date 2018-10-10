package oop;
import java.util.Scanner;
public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle one= new Rectangle();
System.out.println(one.getLength());
System.out.println(one.getWidth());
one.changeLength(4);
one.changeWidth(5);
System.out.println(one.getArea());
System.out.println(one.getPerimeter());
	}

}
