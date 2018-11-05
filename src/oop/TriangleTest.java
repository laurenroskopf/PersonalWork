package oop;
import java.util.Scanner;
public class TriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
double secondheight=0;
double largest=0;
do{
	System.out.println("Enter the base of the first triangle");
	double firstbase=input.nextDouble();
	System.out.println("Enter the height of the first triangle");
	double firstheight= input.nextDouble();
	System.out.println("Enter the base of the second triangle");
	double secondbase=input.nextDouble();
	System.out.println("Enter the height of the second triangle (9999 to be done)");
	secondheight= input.nextDouble();
	RightTriangle one= new RightTriangle (firstbase, firstheight);
	RightTriangle two= new RightTriangle (secondbase, secondheight);
	double firstarea= one.area();
	double secondarea= two.area();
	if (firstarea>secondarea){
		System.out.println("The first triangle has the largest area");
	}else{
		System.out.println(secondarea);

	}
	
	
}while(secondheight !=9999);
	}

}
