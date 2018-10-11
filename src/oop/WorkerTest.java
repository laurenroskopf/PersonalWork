package oop;

public class WorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Worker bob= new Worker();
bob.setHours(6);
bob.setRate(10.0);
System.out.println(bob.getHours());
System.out.println(bob.getRate());
System.out.println(bob.payCheck());
System.out.println(bob.raise(1));

	}

}
