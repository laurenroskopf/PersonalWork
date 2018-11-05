package randomNumbers;
import java.util.Random;
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator= new Random();
int min=1;
int max=2;
int counter=0;
int heads=0;
int tails=0;
for (counter=1; counter<=100000; counter++){
	int randomNum= min+generator.nextInt(max-min+1);
	if (randomNum==1){
		heads++;
	}
	else{
		tails++;
	}
}
System.out.println("The number of heads flipped is: " +heads);
System.out.println("The number of tails flipped is: " + tails);

	}

}
