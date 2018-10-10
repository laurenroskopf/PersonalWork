package oop;

public class Circle {
private double radius;
public Circle(){
radius=0;
}
public Circle(double radius){
}
public double getRadius(){
	return radius;
}
public double getCircumfrence(){
	return radius*2*3.14;
}
public double getArea(){
	return (radius*radius)*3.14;
}
public void changeRadius(double newRadius){
	radius=newRadius;
}
}


