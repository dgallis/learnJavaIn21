
public class Motorcycle {
	String make;
	String color;
	boolean engineStatus = true;
	
	void startEngine() {
		if (engineStatus == true) {
			System.out.println("The engine is already on");
		}
		else {
			engineStatus = true;
			System.out.println("the engine is now on");
		}
	}
	//method to show all current attributes
	void showAtts() {
		System.out.println("This motorcycle is a " + color + " "+ make);
		if (engineStatus == true) {
			System.out.println("The engine is on");
		}
		else {
			System.out.println("The engine is ooff");
		}
	}
}
