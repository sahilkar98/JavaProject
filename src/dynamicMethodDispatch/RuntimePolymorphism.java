package dynamicMethodDispatch;

class A{
	
	public void show() {
		System.out.println("In the A method");
	}
}

class B extends A{
	public void show() {
		System.out.println("In the B method");
	}
}

class C extends A{
	public void show() {
		System.out.println("In the C method");
	}
}

public class RuntimePolymorphism {

	public static void main(String[] args) {
		A obj = new A();
		obj.show();
		
		obj = new B();
		obj.show();
		
		obj = new C();
		obj.show();

	}

}
