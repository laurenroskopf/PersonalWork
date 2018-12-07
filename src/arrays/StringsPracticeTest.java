package arrays;
import java.util.Scanner;
public class StringsPracticeTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner input= new Scanner(System.in);
		int counter=0;
		String[]teachers=new String[10];
		for(counter=0; counter<10; counter++){
		System.out.println("Enter a name of a teacher");
		teachers[counter]=input.nextLine();
		sum= sum+ (teachers[counter].length()-1);}
		System.out.println("The average length is" +sum/10);
}
}

