package hw4JavaVariablesInitialized;

public class AboutMe {

		public String myNameString = "monir";

//		 a variable is declared
		public int year;
//		 a variable is initialized 
		public byte age = 114;
		public short leanth = 200;
		public int mySalary = 123456;
		public long myBankBalance = 24322678684938l;
		public float myHight = 166.44f;
		public double myGrade = 34.87897667;
		public char gender = 'M';
		public boolean isPlantHuman = false;

		public AboutMe() {
			System.out.println("This is all about Myself");
		}

		public void aboutMe() {// Method implemented
			System.out.println("MY name:" + myNameString + "\tMy age:" + age + "\tMY Leanth:" + leanth + "\tMY Salary is:"
					+ mySalary + "\tbank Balance is:" + myBankBalance + "\tMy hights:" + myHight + "\tMy grade:" + myGrade
					+ "\tI am:" + gender + "\tIt's:" + isPlantHuman);

		}

	}
