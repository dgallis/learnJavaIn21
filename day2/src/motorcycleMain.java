
public class motorcycleMain {
	public static void main(String[] args) {
		Motorcycle m = new Motorcycle();
		m.make = "Yamaha fz6";
		m.color = "Grey!";
		System.out.println("Calling show atts......");
		m.showAtts();
		System.out.println("Starting engine.......");
		m.startEngine();
	}
}
