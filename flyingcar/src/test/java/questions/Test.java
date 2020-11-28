package questions;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Test {
	
	@org.junit.Test
	public void flyingcar_test() {
		FlyingCar fc = new FlyingCar();
		fc.fly();
		fc.drive();
		fc.showInfo();
	}
	
}
