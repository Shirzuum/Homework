package hw11UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super();

		System.out.println("this constructor from Daughter class");
		super.father();
		super.fatherInfo("shirazum", 76, 'M', true);
		super.familyName = "JOLO";
		System.out.println("Family Name:" + familyName);
	}

	public Daughter(String birthMonth, int age) {
		super();
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth Month:" + birthMonth + "\nAge:" + age);
	}

	public void daughter() {
		System.out.println("this void type methord is from daughter class");
	}

	public void daughterInfo(String birthMonth, int age) {
		System.out.println("Birth Month:" + birthMonth + "\nAge:" + age);

	}

}
