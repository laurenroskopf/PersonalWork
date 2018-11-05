package decisionStructures;

public class PerfectNumbersNestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
		int divisor=0;
		int sum=0;
		int output=0;
		for(number=1; number<=1000; number++){
			sum=0;
		for (divisor=1; divisor<number; divisor++){
		if(number%divisor==0){
		sum=sum+divisor;
		if(sum==number){
		System.out.println(number);}
		}
		}
		
		}

	}

}
