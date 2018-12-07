package arrays;
import java.util.Scanner;
public class StudentsNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.println("How many students: ");
int students= input.nextInt();
String[][]names=new String[students][2];
int sum=0;
for(int rows=0; rows<students; rows++){
	for (int columns=0; columns<2; columns++){
		if (columns==0){
			System.out.println("Enter students first name");
			String firstname=input.nextLine();
			names[rows][columns]=firstname;
			int length=firstname.length();
			sum=sum+length;}
		else{
			System.out.println("Enter the students last name");
			String lastname= input.nextLine();
			names[rows][columns]= lastname;}
	}
}System.out.println("Average length of first names: "+sum/students);
for(int xrows=0; xrows<students; xrows++){
	System.out.println(names[xrows][1]+ ", "+names[xrows][0]);
}
	}

}
