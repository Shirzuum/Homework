package hw13Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		Sister sister = new Sister();
		sister.sister();
		sister.sister(12, 13);
		sister.sister(10, "20", 30);
		Sister.sister(10, 20, 30, 40);
		sister.sister(10, "80", 4.23f);
		Niece niece = new Niece();
		niece.sister();
		niece.sister(12, 13);
		niece.sister(10, "20", 30);

	}

}
