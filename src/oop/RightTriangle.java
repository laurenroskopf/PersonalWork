package oop;

public class RightTriangle {
private double base;
private double height;
public RightTriangle(){
	base=2;
	height=2;
}
public RightTriangle(double xbase, double xheight){
	if(xbase<0){
		base=10;
	}else{
		xbase=base;
	}
	if(xheight<0){
		height=10;
	}else{
		xheight=height;
	}
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
