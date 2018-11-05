package oop;

public class Phone {
private double phonenumber;
private double speeddial;
private double lastcalled;
private double emergencynumber;
private double numbercalls;
private double minutes;

public Phone(){
	phonenumber= 262;
	speeddial= 141;
	lastcalled=888;
	emergencynumber=911;
	numbercalls=16;
	minutes=99;
}
public Phone(double xphonenumber, double xspeedial, double xlastcalled, double xemergencynumber, double xnumbercalls, double xminutes){
	if (xphonenumber<0){
		phonenumber=0;
	}
	else{
		xphonenumber=phonenumber;
	}
}
public void makeacall(double newlastcalled, double newminutes){
lastcalled= newlastcalled;
minutes= minutes+newminutes;
}
}