package stings;

public class Essay {
	private String name;
	private String text;
public Essay(){
name= "bob duncan";
text= "lauren is the best person ever. lauren is sitting next to rhea and leah and emily berger. emily is not an actual berger, thats just her last name. i have a dog named cooper, he is very cute but sometimes he is mean and annoying. the end";
	}
public void setName(String newName){
	name= newName;
}
public void setTest(String newText){
	text= newText;
}
public String uppercase(){
	int space= name.indexOf(" ");
	String firstname= name.substring(space);
return firstname.toUpperCase();
}
public int lengthofname(){
	int space= name.indexOf(" ");
	String lastname= name.substring(0, space);
	return (lastname.length())-1;
}
public boolean containsx(){
	return name.contains("x");
}
public int wordss(){
int length= text.length();
int counter= 0;
int spaces=0;
for (counter=1; counter<=length-1; counter++){
	if ((text.charAt(counter))==' '){
		spaces++;
	}
	

}
return spaces+1;
}
}
