package hw3JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println(aboutMe.myNameString);
		System.out.println(aboutMe.age);
		System.out.println(aboutMe.leanth);
		System.out.println(aboutMe.mySalary);
		System.out.println(aboutMe.myBankBalance);
		System.out.println(aboutMe.myHight);
		System.out.println(aboutMe.myGrade);
		System.out.println(aboutMe.gender);
		System.out.println(aboutMe.itPlantHuman);

		System.out.println("MY name:" + aboutMe.myNameString + "\tMy age:" + aboutMe.age + "\tMY Leanth:"
				+ aboutMe.leanth + "\tMY Salary is:" + aboutMe.mySalary + "\tbank Balance is:" + aboutMe.myBankBalance
				+ "\tMy hights:" + aboutMe.myHight + "\tMy grade:" + aboutMe.myGrade + "\tI am:" + aboutMe.gender
				+ "\tIt's:" + aboutMe.itPlantHuman);

	}

}
