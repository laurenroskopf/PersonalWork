package oop;

public class Numbers {
public Numbers(){
}

public void sayNumber(double num){
	System.out.println("Your number is:"+ num);
}
public void sayNumberPlusTwo(double num){
	System.out.println(num+2);
}
public void saySum(double first, double second){
	System.out.println(first+second);
}
public double returnSquare (double value){
	return (value*value);
}
public double returnArea (double length, double width){

return (length*width );}

public int returnRoundUp(double number){
	int temp= (int)Math.ceil(number);
	return temp;
	
}
}