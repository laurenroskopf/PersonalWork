package oop;

public class TestRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Room closet= new Room();
Room kitchen= new Room ();
kitchen=closet;
Room basement= new Room();
closet= basement;
double length= 2.0;
double height = 2.0;
double doorlength= 1.0;
double doorheight= 1.0;
closet.sayArea();

	}

}
