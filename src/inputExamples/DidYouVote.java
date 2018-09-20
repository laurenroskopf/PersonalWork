package inputExamples;
import java.util.Scanner; 
public class DidYouVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Boolean answer= false;
Scanner input = new Scanner(System.in);
System.out.println("Did you vote?");
answer = input.nextBoolean();
System.out.println(answer);
	}

}
