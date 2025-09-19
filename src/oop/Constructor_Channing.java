package oop;

class Demo1 {
	String Brand;
	String Model;
	String Type;
	
	Demo1() {
		this("BMW");
	}

	Demo1(String Brand) {
		this(Brand,"M4");
	}

	Demo1(String Brand, String Model) {
		this(Brand,Model,"Luxary");
	}

	Demo1(String Brand, String Model,String Type) {
		this.Brand = Brand;
		this.Model = Model;
		this.Type = Type;
	}
	
	void Details() {
		System.out.println(this.Brand);
		System.out.println(this.Model);
		System.out.println(this.Type);
	}
	
}

public class Constructor_Channing {
	public static void main(String[] args) {
		Demo1 dm = new Demo1();
		dm.Details();
	}
}
