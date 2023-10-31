package accessModifiers;

public class ThisKeyword {

	private int roll_no;
	private String s_name;
	private int age;
	
	public ThisKeyword(int roll_no, String s_name, int age ){
		this.roll_no=roll_no;
		this.s_name=s_name;
		this.age=age;
	}
	
	public static void main(String[] args) {
		ThisKeyword pm = new ThisKeyword(1,"Sahil",25);
		System.out.println("Roll number is: " + pm.roll_no);
		System.out.println("Name is: " + pm.s_name);
		System.out.println("age is: " + pm.age);

	}

}
