package hw11UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {
		Father father = new Father();
		Father father1 = new Father("Monir",25,'M',false);
		father.father();
		father.fatherInfo("Monir", 25, 'M', false);
		Daughter daughter = new Daughter();
		Daughter daughter1 = new Daughter("May",13);
		daughter.daughter();
		daughter.daughterInfo("May",13);
		
	}

}
