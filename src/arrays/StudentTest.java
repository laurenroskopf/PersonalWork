package arrays;
import java.util.Scanner;
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number of students in a class");
		int students= input.nextInt();
		System.out.println("Enter the number of test each student has to take");
		int tests= input.nextInt();
		int[][]testscores=new int[students][tests];
		int sum=0;
		for(int rows=0; rows<students; rows++){
		for (int columns=0; columns<tests; columns++){
		System.out.println("Enter the test score");
		int testscore=input.nextInt();
		testscores[rows][columns]= testscore;
		}
		}
		for (int counter=0; counter<students; counter++){
		for(int xrows= 0; xrows<students){
		for (columns=0; columns<tests; columns++){
		testscore[

	}

}
