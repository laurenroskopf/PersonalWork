package oop;

public class Worker {
private int hours;
private double rate;
public Worker (){
	hours=0;
	rate=0;
}
public Worker (int hours, double rate){
}
public int getHours(){
	return hours;
}
public double getRate(){
return rate;
} 
public void setHours(int newHours){
	hours=newHours;
}
public void setRate(double newRate){
	rate=newRate;
}
public double payCheck(){
return (hours*rate);
}
public double raise(double raiseRate){
	return (rate+raiseRate);
	
}
}