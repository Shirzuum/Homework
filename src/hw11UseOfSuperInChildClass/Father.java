package hw11UseOfSuperInChildClass;

public class Father {
	public String name;
	public String familyName;
	public int age;
	public char sex;
	public boolean citizen;

	public Father() {
		System.out.println("this constructor from father class");
	}

	public Father(String Name, int age, char sex, boolean citizen) {
		super();
		this.name = Name;
		this.age = age;
		this.sex = sex;
		this.citizen = citizen;
		System.out.println("Name:" + Name + "\nAge:" + age + "\nSex:" + sex + "\nCitizen:" + citizen);
	}

	public void father() {
		System.out.println("this void type methord is from father class");
	}

	public void fatherInfo(String name, int age, char sex, boolean citizen) {
		System.out.println("Name:" + name + "\nAge:" + age + "\nSex:" + sex + "\nCitizen:" + citizen);

	}

}
