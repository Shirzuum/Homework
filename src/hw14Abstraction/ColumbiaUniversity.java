package hw14Abstraction;

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
		System.out.println("this from commonroom method");

	}

	@Override
	public void laboratory() {
		System.out.println("this from laboratory method");

	}

	@Override
	public void languageClub() {
		System.out.println("this from languageClub method");

	}

	@Override
	public void emergencyRoom() {
		System.out.println("this from emergencyRoom method");
	}

	@Override
	public void surgeryRoom() {
		System.out.println("this from surgeryRoom method");

	}

	@Override
	public void cafeteria() {
		System.out.println("this from cafeteria method");

	}

	@Override
	public void lawInfo() {
		System.out.println("this from lawInfo method");

	}

	@Override
	public void vocationalInfo() {
		System.out.println("this from vocationalInfo method");

	}

	@Override
	public void classSize() {
		System.out.println("this from classSize method");

	}

	@Override
	public void playGround() {
		System.out.println("this from playGround method");

	}

	@Override
	public void teacher() {
		System.out.println("this from teacher method");

	}

	@Override
	public int anatomyLab() {
		System.out.println("this from lawInfo method");
		return 0;
	}

	@Override
	public int hygiene() {
		System.out.println("this from lawInfo method");
		return 0;
	}

}
