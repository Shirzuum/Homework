package hw10Abstraction;

/*regular class can extends abstract class with some error
 * only one keywords is used for the inheritance in Java for a regular Class
 * regular class can not extends another interface
 * regular class can extends another regular class but not more then one class 
 */
public class ColumbiaUniversity extends MedicalSchool {

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
