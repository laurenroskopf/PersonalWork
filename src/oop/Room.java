package oop;
import java.util.Scanner;
public class Room {
public Room (){
	}
public void sayArea(){
	double length= 2.0;
	Scanner input= new Scanner(System.in);
	System.out.println("What is the length of a wall?");
	length= input.nextInt();
	double height= 2.0;
	System.out.println("What is the height of a wall?");
	height= input.nextInt();
	System.out.println("Area= "+ height*length);
}
public void sayAreaWithDoor(){
	double height= 2.0; 
	System.out.println("What is the height of the room?");
	double length= 2.0;
	System.out.println("What is the length of the room?");
	double doorheight= 2.0;
	System.out.println("What is the height of the door");
	double doorlength= 2.0;
	System.out.println("What is the length of the door");
	System.out.println("The area of the room without the door is " +((length* height)- (doorlength*doorheight)));
	
}
}

