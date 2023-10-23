package test;

public class DecisionMaking {

	public static void main(String[] args) {
		int A = 10;

		if (A < 15) {
			System.out.println(+A + " is less than 15");
		} else
			System.out.println(+A + " is greater than 15");
		System.out.println("Default statement");

		int num = 20;
		switch (num) {
		case 5:
			System.out.println("It is 5");
			break;
		case 10:
			System.out.println("It is 10");
			break;
		case 15:
			System.out.println("It is 15");
			break;
		case 20:
			System.out.println("It is 20");
			break;
		default:
			System.out.println("Not present");

		}
		
		for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                continue;
 
            // If number is odd, print it
            System.out.println(i + " ");
        }
		
		
		boolean t = true;
        System.out.println("Before the return.");
 
        if (t)
            return;
        System.out.println("This won't execute.");
		

	}
}
