package oop;

public class Trapezoid {
private double base1;
private double base2;
private double height;
private double leg;
public Trapezoid(){
	base1=5;
	base2=10;
	height=7;
	leg=(Math.hypot(height,2.5));
	
}
public Trapezoid(double base1, double height, double base2, double leg){
}
public double perimeter(){
return(base1+base2+leg*2);
}
public double area(){
	return ((base1+base2)/2)*height;
}
}

