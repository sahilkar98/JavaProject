package arrays;

class Student{
	public int roll_no;
	public String name;
	
	Student(int roll_no,String name){
		this.roll_no=roll_no;
		this.name=name;
	}
}

public class ArrayClass {

	public static void main(String [] args) {
		int [] arr = new int[5];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		for(int i =0;i<arr.length;i++) {
			System.out.println("Array elements at "+i+":"+arr[i]);
		}
		
		
		Student [] st = new Student[5];
		
		st[0]=new Student(1,"Sahil");
		st[1]=new Student(23,"Aditya");
		st[2]=new Student(41,"Shruti");
		st[3]=new Student(100,"Ajmal");
		st[4]=new Student(111,"Soham");
		
		for(int j=0;j<st.length;j++) {
			System.out.println("Array elements in student at "+j+": "+st[j].roll_no+"-"+st[j].name);
		}
		
	}
}
