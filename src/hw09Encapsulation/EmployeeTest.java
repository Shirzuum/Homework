package hw09Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Monir");
		employee.setAge(25);
		employee.setSex('M');
		employee.setCitizen(true);
		System.out.println("Employee Name:" + employee.getName() + "\nEmployee Age:" + employee.getAge()
				+ "\nEmployee Gender:" + employee.getSex() + "\nEmployee USA Citizen:" + employee.isCitizen());

	}

}
