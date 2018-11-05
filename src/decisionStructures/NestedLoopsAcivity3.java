package decisionStructures;

public class NestedLoopsAcivity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		int divisors = 0;
		int divisor = 0;
		int largest = 0;
		int counter=0;
		for (number = 1; number <= 1000; number++) {
			for (divisor = 1; divisor <= 1000; divisor++) {
				if (number % divisor == 0) {
					divisors++;
				}if (divisors > largest) {
					largest = number;counter=number;
				
				}}divisors=0;
		}
		System.out.println(counter);
	}

}
