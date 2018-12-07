package arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String>names= new ArrayList<String>();
Scanner input= new Scanner(System.in);
names.add(0,"Lauren");
names.add(1,"Rhea");
names.add(0,"Leah");
System.out.println("Enter your name");
String newname=input.nextLine();
names.add(newname);
	}

}
