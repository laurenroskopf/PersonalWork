package arrays;
import java.util.Random;
import java.util.Scanner;
public class RandoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator= new Random();
Scanner input= new Scanner(System.in);
int max=100;
int min=0;
int largest=0;
int counter=0;
System.out.println("Enter the number of scores");
int numScores=input.nextInt();
int[]newarray=new int[numScores];
for (counter=0; counter<numScores; counter++){
int randomnum=min+generator.nextInt(max-min+1);
newarray[counter]=randomnum;
if(randomnum>largest){
	largest=randomnum;
}
}
System.out.println(largest);
	}


}
