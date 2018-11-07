package randomNumbers;
import java.util.Random;
public class FlipACoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator= new Random();
int min=1;
int max=2;
int counter=0;
int countertwo=0;
double heads=0;
double tails=0;
double largest=0;
double smallest=100000;
for(counter=1; counter<=1000000; counter++){
for (countertwo=1; countertwo<100000; countertwo++){
	int randomNum= min+generator.nextInt(max-min+1);
	if (randomNum==1){
		heads++;
	}
	else{
		tails++;
	}
	if (heads>largest){
		largest=heads;
	}
	if(heads<smallest){
		smallest=heads;
	}
}

	}
System.out.println("The largest percentage of heads is: "+ (largest/100000)*100);
System.out.println("The smallest percentage of heads is: " +(smallest/100000)*100);
}
}
