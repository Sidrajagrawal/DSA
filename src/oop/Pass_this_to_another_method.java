package oop;

class A{
	String st;  //Instance Variable
	
	//Constructor
	A(String st){
		this.st = st;  //Local Variable
	}
	
	//Another Method
	public void B() {
		Car mycar = new Car();
		mycar.show(this);
	}
	
}

class Car{
	Car(){
		
	}
	
	public void show(A obj) {
		System.out.println(obj.st + " From Car");
	}
	
}


public class Pass_this_to_another_method {
	public static void main(String args[]) {
		A a = new A("Calling A");
		a.B();
	}
	
}	