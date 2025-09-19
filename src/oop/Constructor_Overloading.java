package oop;

class Rectangle{
	int l;
	int b;
	Rectangle(){
		this.l = 1;
		this.b = 1;
	}
	Rectangle(int l){
		this.l = l;
		this.b = 1;
	}
	Rectangle(int l, int b){
		this.l = l;
		this.b = b;
	}
	
	void Area() {
		System.out.println(l*b);
	}
}

public class Constructor_Overloading {
	public static void main(String args[]) {
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle(5);
		Rectangle rec3 = new Rectangle(5,10);
		rec1.Area();
		rec2.Area();
		rec3.Area();
		
	}
}
