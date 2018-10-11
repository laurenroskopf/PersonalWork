package oop;

public class RightTriangle {
private double base;
private double height;
public RightTriangle(){
	base=2;
	height=2;
}
public RightTriangle(double base, double height){
}
	public double hypot(){
		return Math.hypot(height, base);
	}
public double perimeter(){
	return Math.hypot(height, base)+ base+ height;
	}
public double area(){
	return(base*height)/2;
	
}
}
