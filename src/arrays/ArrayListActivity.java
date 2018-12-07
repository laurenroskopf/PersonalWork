package arrays;
import java.util.ArrayList;
public class ArrayListActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Friend>bffs=new ArrayList<Friend>();
Friend one= new Friend("lauren",16);
Friend two= new Friend("rhea",16);
Friend three= new Friend("emily", 16);
bffs.add(0,one);
bffs.add(0, two);
bffs.add(0, three);
bffs.get(2);


	}

}
