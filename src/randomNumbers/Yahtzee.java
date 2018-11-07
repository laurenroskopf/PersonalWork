package randomNumbers;

import java.util.Random;

public class Yahtzee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator= new Random();
int min=1;
int max=6;
int counter=0;
int number=0;
boolean yahtzee= false;
int times=0;
do{ 
	int one=min+generator.nextInt(max-min+1);
	int two=min+generator.nextInt(max-min+1);
	int three= min+generator.nextInt(max-min+1);
	int four= min+generator.nextInt(max-min+1);
	int five= min+generator.nextInt(max-min+1);
	if(one==two&& one==three&& one==four&& one==five){
		yahtzee = true;
	}
	else{
		yahtzee=false;
		times++;
	}
}while(yahtzee==false);
System.out.println("It took "+ times+ " times to get yahtzee!!!!");
	}
	}
	




