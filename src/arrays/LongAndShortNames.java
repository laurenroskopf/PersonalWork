package arrays;
import java.util.Scanner;
public class LongAndShortNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number of people you know");
		int people= input.nextInt();
		int counter= 0;
		int smallest=999;
		int largest=0;
		String namelargest="lauren";
		String namesmallest="lauren";
		String[]names=new String[people];
		for (counter=0; counter<people; counter++){
		System.out.println("Enter the first and last name of the first person");
		names[counter]= input.nextLine();
		System.out.println(names[counter]);
		if(names[counter].length()>largest){
		namelargest=names[counter];}
		if(names[counter].length()<smallest){
		namesmallest=names[counter];}}
		System.out.println("The longest name is " +namelargest);
		System.out.println("The shortest name is " + namesmallest);

	}

}
