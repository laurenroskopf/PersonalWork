package decisionStructures;
import java.util.Scanner;
public class Lauren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);

int largest=0;

System.out.println("Please enter a number(9999 to quit): ");
int number = input.nextInt();

while (number <9999 && number>0){
	System.out.println("Please enter a number(9999 to quit): ");
	number= input.nextInt();

if (number> largest && number<9999 || number>9999){
	largest=number;
}

}
System.out.println("The largest number is: "+ largest);
	}

}
