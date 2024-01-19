package hw12Abstraction;

/*abstract class can extends another abstract class but not more then one
 * only two {extends,implements) keywords are used for the inheritance in Java for Abstract Class
 * abstract class can extends regular class
 *  abstract class can not extends interface but with  implements keyword abstract class can inheritance interface
 */
public abstract class MedicalSchool extends NursingSchool  implements LawSchool {
	public abstract int anatomyLab();

	public void biochemistryLab() {
		System.out.println("this is methods");
	}

// we can create a Constructor but it is not default Constructor . Because object can not be created for this class.
	public MedicalSchool() {

	}

}
