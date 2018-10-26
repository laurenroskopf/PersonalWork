package decisionStructures;
import java.util.Scanner;
public class ForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
int counter= 0;
int number=0;
int sum= 0;
for (counter=1; counter<=5; counter= counter+1){
System.out.println("Enter a number: ");
number = input.nextInt();
sum= sum+number;

	}
	System.out.println(sum);
	}
}
