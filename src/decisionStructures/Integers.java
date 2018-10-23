package decisionStructures;
import java.util.Scanner;
public class Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	System.out.println("What should be the max number?");
	int number= input.nextInt();
int count=0;
while (count<=number){
	count= count+2;
	int sum = 0;
	sum+=count;
	System.out.println(sum);
}

	}

}
