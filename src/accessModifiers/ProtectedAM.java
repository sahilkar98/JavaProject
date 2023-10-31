package accessModifiers;

public class ProtectedAM {

	protected int roll_no = 23;
	protected String s_name = "Sahil";
	protected int age = 25;

	public static void main(String[] args) {
		ProtectedAM pm = new ProtectedAM();
		System.out.println("Roll number is: " + pm.roll_no);
		System.out.println("Name is: " + pm.s_name);
		System.out.println("age is: " + pm.age);
	}
}
