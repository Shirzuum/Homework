package hw8Abstraction;

public abstract class MedicalSchool {
	public abstract int anatomyLab();

	public void biochemistryLab() {
		System.out.println("this is methods");
	}

// we can create a Constructor but it is not default Constructor . Because object can not be created for this class.
	public MedicalSchool() {

	}

}
