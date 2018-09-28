package mathOpp;
import java.util.Scanner;
public class PracticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double number= 6.0;
double totallength= 4.16;
Scanner input=new Scanner(System.in);
System.out.println("How many songs are on the device?");
number= input.nextDouble();
System.out.println("What is the total length of the songs?");
totallength= input.nextDouble();
double minutes= (totallength%number);
double seconds= ((totallength/number)-minutes);
System.out.println("The average song length is " + minutes + " minutes and " +seconds*100+ " seconds");
}

}
