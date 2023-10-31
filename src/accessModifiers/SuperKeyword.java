package accessModifiers;

class parent{
	public void support() {
		System.out.println("In the Parent");
	}
}

class child extends parent{
	public void support() {
		super.support();
		System.out.println("In the Child");
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		parent a = new child();
		a.support();
	}
	
}
