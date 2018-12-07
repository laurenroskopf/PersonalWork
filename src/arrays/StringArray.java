package arrays;
import java.util.Scanner;
public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner (System.in);
String[][]names= new String[4][3];
for(int row=0; row<4; row++){
	for(int column=0; column<3; column++){
		System.out.println("Input a name");
		String name= input.nextLine();
		names[row][column]=name;
	}
}
for(int row=0; row<4; row ++){
	for(int column=0; column<3; column++){
		System.out.print(names[row][column]+" ");
	}System.out.println();
}
	}

}
