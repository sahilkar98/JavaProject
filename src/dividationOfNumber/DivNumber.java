
package dividationOfNumber;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("Please Enter the Number:");
			float num = sc.nextFloat();

			System.out.println("Please enter the divisor");
			float divideNum = sc.nextFloat();

			if (divideNum == 0) {
				System.out.println("The divideNum is " + divideNum + " and division by zero is not allowed  ");
			}
			float result = num / divideNum;
			System.out.println("Result is =" + result);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Please enter valid number and divisor");
		} finally {
			sc.close();
		}

	}
}
