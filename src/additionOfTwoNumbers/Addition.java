package additionOfTwoNumbers;

import java.util.InputMismatchException;

public class Addition {

	public int addNumbers(int firstNum, int secondNum) {

		try {
			int result = firstNum + secondNum;
			System.out.println("result is:" + result);
			return result;

		} catch (InputMismatchException e) {
			System.out.println("Please enter valid numbers for addition");
			return 0;
		}
	}

}
