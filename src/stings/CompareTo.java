package stings;
import java.util.Scanner;
public class CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.println("Enter the first name: ");
String firstname= input.nextLine();
System.out.println("Enter the second name: ");
String secondname= input.nextLine();

if ((firstname.compareTo(secondname))>0){
	System.out.println(secondname + " comes before " + firstname);
}
else{
	System.out.println(firstname+ " comes before "+ secondname);
}
	}

}
