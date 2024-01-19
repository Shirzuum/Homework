package hw13Polymorphism;



public class Sister {
	public void sister() {
		System.out.println("this void type method from sister class");
		
	}
	public void sister(int age1, int age2) {
		int total = age1+ age2;
		System.out.println("total Age:"+ total);
		
	}
	public int sister(int age3,String age4,int age5) {
		int total2= age3+Integer.parseInt(age4)+age5;
		System.out.println("Total Age:"+ total2);
		return total2;
	}
	public static void sister(int age1, int age2,int age3, int age4) {
		int total3 = age1+age2+age3+age4;
		System.out.println("Total Age:"+ total3);
		
	}
	public final void sister(int age1,String age8, float age11 ) {
	int total6= age1+ Integer.parseInt(age8)+ (int)age11;
		
		
	
		
		
	
		
	}
	
	

}
