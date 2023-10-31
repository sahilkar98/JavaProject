package accessModifiers;

public class PrivateAM {

	private int roll_no = 23;
	private String s_name = "Sahil";
	private int age = 25;

	public static void main(String[] args) {
		PrivateAM pm = new PrivateAM();
		System.out.println("Roll number is: " + pm.roll_no);
		System.out.println("Name is: " + pm.s_name);
		System.out.println("age is: " + pm.age);
	}
}
