package randomNumbers;
import java.util.Random;
import java.util.Scanner;
public class RollADie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator= new Random();
Scanner input= new Scanner(System.in);
System.out.println("Ener the number of sides on the die");
int sides= input.nextInt();
System.out.println("Enter the number of rolls");
int rolls= input.nextInt();
int min=1;
int max=sides;
int counter=0;
for (counter=1; counter<=rolls; counter++){
	int randomNum= min+generator.nextInt(max-min+1);
	System.out.println(randomNum);
}
	}

}
