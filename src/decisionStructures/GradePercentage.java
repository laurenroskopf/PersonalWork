package decisionStructures;
import java.util.Scanner;
public class GradePercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
System.out.println("What was your first test score?");
double firstscore=input.nextDouble();
System.out.println("What was your second test score?");
double secondscore= input.nextDouble();
System.out.println("What was your third test score?");
double thirdscore= input.nextDouble();
System.out.println("True or False: you did the extra credit");
boolean extracredit= input.nextBoolean();
double extracreditpoints=0;
if (extracredit=true){
	System.out.println("How many points was the extra credit worth?");
	extracreditpoints= input.nextDouble();
}
System.out.println((firstscore+secondscore+thirdscore)/3 + extracreditpoints);
	}

}
