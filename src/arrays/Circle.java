package arrays;

public class Circle {
	private double radius;
	public Circle(){
	radius=3;
	}
	public Circle(double xradius){
		if (xradius<= 0){
			radius= 10;
		}
		else{
			radius=xradius;
		}
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

}}
