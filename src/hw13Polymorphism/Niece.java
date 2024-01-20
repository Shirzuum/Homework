package hw13Polymorphism;
/*
 * method overriding is when a child class want to change parent class method by overriding 
 * the method body or argument for different result is method overriding
 */
public class Niece extends Sister {

	@Override
	public void sister() {
		System.out.println("this void type method from niece class");


	}

	@Override
	public void sister(int age1, int age2) {
		int total = age1 + age2+100;
		System.out.println("total Age:" + total);

		

	}

	@Override
	public int sister(int age3, String age4, int age5) {
		int total2 = age3 + Integer.parseInt(age4) + age5-20;
		System.out.println("Total Age:" + total2);
		return total2;

	}
	/*
	 * static method can not be override because this is local method of sister
	 * class
	 * 
	 * @Override public static void sister(int age1, int age2,int age3, int age4) {
	 * int total3 = age1+age2+age3+age4; System.out.println("Total Age:"+ total3);
	 * 
	 * }
	 */

	/*
	 * final type method can not be override this is a rule
	 * 
	 * 
	 * @Override public final void sister(int age1,String age8, float age11 ) { int
	 * total6= age1+ Integer.parseInt(age8)+ (int)age11;
	 * System.out.println("Total Age:"+ total6); }
	 */

}
