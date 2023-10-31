package highestFrequency;

public class HighestFrequencyElement {

	public static int findHighestFrequencyElement(int[] arr) {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Array is empty or null");
		}

		int maxElement = arr[0];
		int maxFrequency = 1;

		for (int i = 0; i < arr.length; i++) {
			int currentElement = arr[i];
			int currentFrequency = 1;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == currentElement) {
					currentFrequency++;
				}
			}

			if (currentFrequency > maxFrequency) {
				maxFrequency = currentFrequency;
				maxElement = currentElement;
			}
		}

		return maxElement;
	}

	public static void main(String[] args) {
		int[] arr = { 11,13,54,11,11,54,34,22,11 };
		int highestFrequencyElement = findHighestFrequencyElement(arr);
		System.out.println("The element with the highest frequency is: " + highestFrequencyElement);
	}
}
