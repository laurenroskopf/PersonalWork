package arrays;
import java.util.Random;

public class SmallestRectangleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator= new Random();
		int max=56;
		int min=10;
		int counter=0;
		int smallest=3136;
		Rectangle[]rectangles=new Rectangle[100];
		Rectangle smallestRectangle=rectangles[0];
		for (counter=0; counter<100; counter++){
			int width= min+generator.nextInt(max-min+1);
			int length= min+generator.nextInt(max-min+1);
			Rectangle lauren = new Rectangle(length, width);
			rectangles[counter]= lauren;
			int area= length*width;
			if(area<smallest){
				smallestRectangle= rectangles[counter];
			}
	}
		
			
		
rectangles[0]= smallestRectangle;
System.out.println(rectangles[0].getArea());
}}
