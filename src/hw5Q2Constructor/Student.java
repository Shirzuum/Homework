package hw5Q2Constructor;

public class Student {
	public String stnameString;
	public int stid;
	public char gender;
	public boolean isjavaProgrammer;
	public float grade;

	public Student() {
		System.out.println("This is from the default Constructor of the Student class");

	}

	public Student(String stnameString, int stid, char sex, boolean isjavaProgrammer, float grade) {
		this.stnameString = stnameString;
		this.stid = stid;
		this.gender = sex;
		this.isjavaProgrammer = isjavaProgrammer;
		this.grade = grade;
		System.out.println("Student Name:" + stnameString + "\nID:" + stid + "\nGender:" + gender + "\nGrade:" + grade
				+ "\njava programmer:" + isjavaProgrammer);
	}

}
