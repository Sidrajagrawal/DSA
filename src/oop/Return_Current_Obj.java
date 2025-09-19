package oop;

class Demo{
	Demo(){
		
	}
	
	public Demo function1() {
		System.out.println("Calling 1");
		return this;
	}
	
	public Demo function2() {
		System.out.println("Calling 2");
		return this;
	}
	
	public Demo function3() {
		System.out.println("Calling 3");
		return this;
	}
	
	//Last do not return anything
	public void function4() {
		System.out.println("Calling 4");
	}
}

public class Return_Current_Obj {
	public static void main(String args[]) {
		Demo dm = new Demo();
		dm.function1().function2().function3().function4();
	}
}
