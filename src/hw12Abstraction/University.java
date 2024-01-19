package hw12Abstraction;

/*interface can extends more then one interface
 *one keywords (implements) used for the inheritance in Java for a interface
 * interface can not extends abstract class 
 * interface can not extends regular class
 */
public interface University extends College, Hospital {
	public void classSize();

	public void playGround();

	public void teacher();

//	we can not make constructor in Interface  

	public default void gymnasium() {

	}

	public static void library() {

	}
}
