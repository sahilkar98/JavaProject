package test;

public class Loops {

	public static void main(String[] args) {
		int a = 0;
		while (a <= 10) {
			System.out.println("a is "+a);
			a++;
		}
		System.out.println("-------------------------------");
		
		 for (int b=0;b<=10;b++)
	       {
	         System.out.println("b is "+b);
	       }
		 
		 System.out.println("-------------------------------");
		
		 int c=0;
	      do
	      {
	        System.out.println("C is "+c);
	        c++;
	      }while(c<=10);
	      System.out.println("-------------------------------");
	}
}
