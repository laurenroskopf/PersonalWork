package decisionStructures;
import java.util.Scanner;
public class HowManyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
int number=0;
int times= 0;
int sum=0;
System.out.println("Enter a number");
number= input.nextInt();
sum=sum+number;
do{
	System.out.println("Enter a number");
	number= input.nextInt();
	sum= sum+number;
	times++;
}
while (sum<=2018); 
System.out.println("The number of numbers you entered is: " +(times+1));
	}

}
