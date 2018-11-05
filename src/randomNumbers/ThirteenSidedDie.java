package randomNumbers;
import java.util.Random;
public class ThirteenSidedDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator= new Random();
int min=1;
int max=13;
int counter=0;
int multiples=0;
for(counter=1; counter<=87; counter++){
	int randomNum= min+generator.nextInt(max-min+1);
	if (randomNum%3==0){
		multiples++;
	}
}
System.out.println("The number of times a multiple of three was rolled is "+ multiples);
	}

}
