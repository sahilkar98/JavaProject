package stringHandling;

import java.util.Scanner;

public class StringVariousMethods {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two strings");
		
		String first = sc.nextLine();
		System.out.println("Length of the "+first+" String is"+first.length());
		System.out.println("String converted to Upper case is: "+first.toUpperCase());
		String second = sc.nextLine();
		System.out.println("Length of the "+second+" String is"+second.length());
		System.out.println("String converted to Upper case is: "+second.toUpperCase());

		String third = first.concat(second);
		System.out.println("concatenated String is: "+third);
	}

}
