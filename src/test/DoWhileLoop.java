package test;

public class DoWhileLoop {

	public static void main(String args[]) {
		int i = 0;
		do {
			int j = 1;
			while (j <= 8) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		} while (i <= 6);
	}
}
