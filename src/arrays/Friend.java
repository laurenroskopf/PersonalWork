package arrays;
public class Friend {
	private String name;
	private int age;
	public Friend ()
	{name="lauren";
	age=0;
	}
	public Friend(String xname, int xage){
		name=xname;
		age=xage;
	}
	public void sayMessage()
	{
		System.out.println("Message");
	}
	public void setName(String xnewname){
		name=xnewname;
	}
	public void setAge(int newage){
		age= newage;
	}
}
