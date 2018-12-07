package arrays;
import java.util.ArrayList;
public class FriendArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Friend>friends= new ArrayList<Friend>();
Friend one= new Friend("emily",16);
Friend two= new Friend("rhea",16);
Friend three = new Friend ("leah",16);
friends.add(0, one);
friends.add(0,two);
friends.add(0,three);



	}

}
