package evenNumberProblem;

import java.util.ArrayList;

public class EvenNumber {

	public static ArrayList<Integer> findEvenNumbers(int[] arr) {
		ArrayList<Integer> evenNumbers = new ArrayList<>();

		for (int i : arr) {
			if (i % 2 == 0) {
				evenNumbers.add(i);
			}
		}

		return evenNumbers;
	}

	public static void main(String[] args) {
		int[] arr = {11,12,14,15,36,77,444,32,19 };
		ArrayList<Integer> evenNumbers = findEvenNumbers(arr);

		System.out.println("Even numbers in the array are as follows:");
		for (int evenNumber : evenNumbers) {
			System.out.println(evenNumber);
		}
	}
}
