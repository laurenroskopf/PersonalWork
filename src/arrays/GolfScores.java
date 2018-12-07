package arrays;
import java.util.Random;
public class GolfScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator= new Random();
int sum=0; 
int max=7;
int lowest=999;
int min=1;
int holeinone=0;
int[][]golf= new int[13][18];
for(int rows=0; rows<13; rows++){
	for (int columns=0; columns<18; columns++){
		int randomnum=min+generator.nextInt(max-min+1);
		golf[rows][columns]=randomnum;
		if ((golf[rows][columns])==1){
			holeinone++;
		}
		sum=sum+(golf[rows][columns]);}
	if (sum<lowest){
		lowest=sum;
		}sum=0;
	}System.out.println("The number of hole in ones was "+holeinone);
	System.out.println("The best score was "+lowest);
}
	}
