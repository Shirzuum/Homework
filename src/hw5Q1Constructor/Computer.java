package hw5Q1Constructor;

public class Computer {
	public String brand;
	public String model;
	public String operatingsystem;
	public int price;
	public char grade;
	public boolean madeinusa;
	
	
	public Computer() {
		System.out.println("This is from the default Constructor of Computer class.");
		
	}


	public Computer(String brand, String model, String operatingsystem, int price, char grade, boolean madeinusa) {
		this.brand = brand;
		this.model = model;
		this.operatingsystem = operatingsystem;
		this.price = price;
		this.grade = grade;
		this.madeinusa = madeinusa;   
		System.out.println("My brand:"+ brand + "\nMy Model:"+ model+ "\nMy operating system:"+ operatingsystem+ "\nPrice:"+ "$"+price+ "\ngrade:"+ grade + "\nMade in the USA:"+ madeinusa );
	}
	

}
