package inheritance;

class bank {
	int getRateOfIntrest() {
		return 0;
	}
}

class SBI extends bank {
	int getRateOfIntrest() {
		return 12;
	}

}

class ICICI extends bank {
	int getRateOfIntrest() {
		return 14;
	}
}

class axis extends bank {
	int getRateOfIntrest() {
		return 15;
	}
}

public class ParentWithTwoChildern {

	public static void main(String[] args) {
		SBI s = new SBI();
		System.out.println(s.getRateOfIntrest());
		
		ICICI i = new ICICI();
		System.out.println(i.getRateOfIntrest());
		
		axis a = new axis();
		System.out.println(a.getRateOfIntrest());
		
		

	}
}
