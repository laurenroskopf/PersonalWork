package arrays;

public class Rectangle {
	private int length;
	private int width;
	public Rectangle(){
	length= 0;
	width= 0; 
	}
	public Rectangle (int xlength, int xwidth){
		length=xlength;
		width=xwidth;
	}
		public int getLength(){
			return length;
		}public int getWidth(){
			return width;
		}
		public int getPerimeter(){
			return (length+ length+ width+ width);
		}
		public int getArea(){
			return (length*width);
		}
		public void changeLength(int newLength){
			length=newLength;
		}
		public void changeWidth(int newWidth){
			width=newWidth;
		}
}
