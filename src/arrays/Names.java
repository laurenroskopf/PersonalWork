package arrays;
import java.util.Scanner;
public class Names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
String[]names= new String[5];
int counter=0;

for (counter=0; counter<5; counter++){
System.out.println("Enter a name");
names[counter]= input.nextLine();
}
System.out.println("Enter a letter: ");
	String specialletter= input.nextLine();
	
for(counter=0; counter<5; counter++){
	int length= names[counter].length();
	String nameletter= names[counter].substring(length-1);
	//System.out.println(nameletter);
	if (nameletter.equals(specialletter)){
		System.out.println(names[counter]);
	}
}
	}

}
