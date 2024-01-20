package hw12Abstraction;

/*regular class can extends abstract class with override method 
 * only two {extends,implements) keywords is used for the inheritance in Java for a regular Class
 * regular class can not extends another interface but with implements keyword it can inheritance interface
 * regular class can extends another regular class but not more then one class 
 */
public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

//	abstract method is not possible in regular class.

	public int biology() {
		int element = 118;
		System.out.println("Total elements of periodical table " + element);
		return element;

	}

	public ColumbiaUniversity() {
		System.out.println("this constructor is from ColumbiaUniversity");
	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}

	@Override
	public int anatomyLab() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int hygiene() {
		// TODO Auto-generated method stub
		return 0;
	}

}
