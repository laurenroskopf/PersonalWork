package decisionStructures;

public class NestedLoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;

		for (counter = 1; counter <= 5; counter = counter + 1) {
			if (counter != 3) {
				System.out.print(counter * 1);
			} else {
				System.out.print(1);
			}

		}
		System.out.println( );
		for (counter = 1; counter <= 5; counter = counter + 1) {
			if (counter != 3) {
				System.out.print(counter * 2);
			} else {
				System.out.print(2);
			}
		}

	}
}
