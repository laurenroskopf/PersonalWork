package oop;

public class Rectangle {
private double length;
private double width;
public Rectangle(){
length= 0;
width= 0; 
}
public Rectangle (double length, double width){
}
	public double getLength(){
		return length;
	}
	public double getWidth(){
		return width;
	}
	public double getPerimeter(){
		return (length+ length+ width+ width);
	}
	public double getArea(){
		return (length*width);
	}
	public void changeLength(double newLength){
		length=newLength;
	}
	public void changeWidth(double newWidth){
		width=newWidth;
	}
}
