package hw6Methods;

public class MyFamily {

	public int child1Age = 23;
	public int child1Age2 = 29;
	public int child1Age3 = 27;

	public int myFamily() {
		int total = child1Age + child1Age2 + child1Age3;
		System.out.println("The sum of my childrens age is: " + total);
		return total;

	}

}
