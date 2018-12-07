package arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class StudentNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
ArrayList<String>studentnames= new ArrayList<String>();
for (int counter=0; counter<5; counter++){
	System.out.println("Enter a students name");
	String name= input.nextLine();
	studentnames.add(name);}
studentnames.remove(0);
studentnames.remove(studentnames.size()-1);
for(int counter=0; counter<studentnames.size(); counter++){
	System.out.println(studentnames.get(counter));
}
}
	}


