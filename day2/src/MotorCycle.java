
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
}
