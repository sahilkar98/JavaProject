package additionOfTwoNumbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter 1st number");
			int firstNum = sc.nextInt();

			System.out.println("Please enter 2nd number");
			int secondNum = sc.nextInt();

			Addition.addNumbers(firstNum, secondNum);
		} catch (InputMismatchException e) {
			System.out.println("Please enter valid numbers for addition");
		}
	}
}
