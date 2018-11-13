package stings;
import java.util.Scanner;
public class LetterPerLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
int counter=0;
System.out.println("Enter a sentence: ");
String sentence= input.nextLine();
int sentencelength= sentence.length();
for (counter=1; counter<=sentencelength; counter++){
	System.out.println(sentence.charAt(counter-1));
}

	}

}
