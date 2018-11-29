package arrays;
import java.util.Random;
import java.util.Scanner;
public class RandoWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
Random generator= new Random();
System.out.println("Enter a sentence");
String sentence= input.nextLine();
String[] words= sentence.split(" ");
int max= words.length-1;
int min=0;
int random= min+generator.nextInt(max-min+1);
System.out.println(words[random]);
	}

}
