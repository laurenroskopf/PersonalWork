package arrays;
import java.util.Random;
public class RectangleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator= new Random();
int max=56;
int min=10;
int counter=0;
Rectangle[]rectangles=new Rectangle[100];
for (counter=0; counter<100; counter++){
	int width= min+generator.nextInt(max-min+1);
	int length= min+generator.nextInt(max-min+1);
	Rectangle lauren = new Rectangle(length, width);
	rectangles[counter]= lauren;
	System.out.println("The length of rectangle " + ((counter)+1) + " is: "+ length);
	System.out.println("The width of rectangle " + (counter+1) +" is " + width);
	System.out.println("The area of rectangle " + (counter+1) + " is " +rectangles[counter].getArea());
	
	}
}
	

}
