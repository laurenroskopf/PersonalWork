package arrays;

import java.util.Scanner;
import java.util.Scanner;
public class FirstName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		String[]names= new String[5];
		int counter=0;

		for (counter=0; counter<5; counter++){
		System.out.println("Enter a name");
		names[counter]= input.nextLine();
		}
		System.out.println("Enter a length: ");
			int specialletter= input.nextInt();
			
		for(counter=0; counter<5; counter++){
			int length= names[counter].length();
			if (length==specialletter){
				System.out.println(names[counter]);
			}
		}
			}

		
	}


