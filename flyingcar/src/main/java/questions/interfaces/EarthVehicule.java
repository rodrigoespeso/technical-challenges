package questions.interfaces;

public interface EarthVehicule {
	
	default void drive() {
		System.out.println("I'm driving like a car");
	}
	
}
