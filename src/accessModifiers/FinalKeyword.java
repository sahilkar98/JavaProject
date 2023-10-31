package accessModifiers;

public class FinalKeyword {
	final int a=10;
	
	public static void main(String[] args) {
		FinalKeyword fk = new FinalKeyword();
		//fk.a=1234;  u can't assign a value to final variable and also u can't extends final class
		
		System.out.println(fk.a);
		

	}

}
