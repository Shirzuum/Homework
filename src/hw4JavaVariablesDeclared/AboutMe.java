package hw4JavaVariablesDeclared;

public class AboutMe {
	
	public String myName;

//	 a variable is declared
	public byte age;
	public short leanth;
	public int mySalary;
	public long myBankBalance;
	public float myHight;
	public double myGrade;
	public char gender;
	public boolean areyouHuman;

	public AboutMe() {// the constructor is declared 
		System.out.println("This is all about us");
	}
	public void aboutme() {// the method is implemented 
		System.out.println("MY name:" + myName+ "\tMy age:" + age + "\tMY Leanth:" + leanth + "\tMY Salary is:"
					+ mySalary + "\nbank Balance is:" + myBankBalance + "\tMy hights:" + myHight + "\tMy grade:" + myGrade
					+ "\tI am:" + gender + "\tIt's:" + areyouHuman);
	}
	

}



