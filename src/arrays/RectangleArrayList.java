package arrays;
import java.util.Random;
import java.util.ArrayList;
public class RectangleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator= new Random();
int min=50;
int max=70;
ArrayList<Rectangle>lauren= new ArrayList<Rectangle>();
for(int counter=0; counter<400; counter++){
	int length= min+generator.nextInt(max-min+1);
	int width= min+generator.nextInt(max-min+1);
	Rectangle one= new Rectangle(length, width);
	lauren.add(counter,one);
}
int xmin=0; 
int xmax=lauren.size()-1;
Rectangle removed=lauren.remove(min+generator.nextInt(max-min+1));
System.out.println(removed.getLength());
int length= lauren.size()-1;
lauren.set(length-1, lauren.get(0));
for(int counter=398; counter>0; counter--){
	Rectangle news=(lauren).get(counter);
	System.out.println(news.getArea());

	}
	}
}
