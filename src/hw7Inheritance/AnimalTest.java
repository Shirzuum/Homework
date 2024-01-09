package hw7Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();
//		single inheritance birds
		Birds birds = new Birds();
		birds.birdsInfo();

//		multilevel inheritance

		BullDog bullDog = new BullDog();
		bullDog.bulldogInfo();
		bullDog.doginfo();
		bullDog.animalInfo();
		bullDog.mammalInfo();

//		Hierarchical inheritance
		Cobra Cobra = new Cobra();
		Cobra.cobraInfo();
		Cobra.snakeInfo();
		Cobra.reptileInfo();
		Cobra.animalInfo();

		Dog dog = new Dog();
		dog.doginfo();
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		Reptile reptile = new Reptile();
		reptile.reptileInfo();

		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

		Snake snake = new Snake();
		snake.snakeInfo();
	}
}
