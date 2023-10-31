package list;

import java.util.LinkedList;

public class LinkedListImplementation {
	public static void main(String[] args) {

		LinkedList<Integer> numbers = new LinkedList<>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		System.out.println(numbers.get(0));
		System.out.println(numbers.get(1));
		;

		System.out.println("ArrayList: " + numbers);

		numbers.set(1, 4);

		numbers.remove(0);
		numbers.remove(Integer.valueOf(3));

		boolean containsTwo = numbers.contains(2);
		System.out.println(containsTwo);
		int size = numbers.size();
		System.out.println(size);
		boolean isEmpty = numbers.isEmpty();
		System.out.println(isEmpty);
		numbers.clear();

		System.out.println("Updated ArrayList: " + numbers);

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		for (int num : numbers) {
			System.out.println(num);
		}

	}
}
