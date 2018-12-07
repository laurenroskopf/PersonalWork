package arrays;
import java.util.Scanner;
import java.util.Random;
public class PrimitivePracticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
Random generator= new Random();
int min=7;
int max= 852;
int[] numbers= new int[100];
int counter=0;
int sum=0;
for(counter=0; counter<100; counter++){
	int value=min+generator.nextInt(max-min+1);
	numbers[counter]=value;}
System.out.println("Enter a number(0-99)");
int request=input.nextInt();
do{System.out.println(numbers[request]);
	System.out.println("Enter a number(0-99)(100 to quit)");
	request= input.nextInt();
	
}while(request<100);
	}

}
