package stings;
import java.util.Scanner;
public class Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.println("Write a sentence: ");
String sentence=input.nextLine();
System.out.println("The first letter is: " +sentence.charAt(0));
System.out.println("The third letter is: " + sentence.charAt(2));
System.out.println("The whole sentence is: "+ sentence);	
System.out.println("Bob is in the sentence: "+ sentence.contains("Bob"));
	}

}
