package questions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Tests {
	
	@Test
	public void whenDriveIsExecutedFromCar() {
		// Given
		Car car = new Car();
		// Then
		assertEquals("I'm driving like a car", car.drive());

	}
	
	@Test
	public void whenFlyIsExecutedFromAeroplane() {
		// Given
		Aeroplane aeroplane = new Aeroplane();
		// Then
		assertEquals("I'm flying like an aeroplane", aeroplane.fly());
	}
	
	@Test
	public void whenDriveIsExecutedFromFlyingCar() {
		// Given
		FlyingCar flyCar = new FlyingCar();
		// Then
		assertEquals("I'm driving like a car", flyCar.drive());
	}
	
	@Test
	public void whenFlyIsExecutedFromFlyingCar() {
		// Given
		FlyingCar flyCar = new FlyingCar();
		// Then
		assertEquals("I'm flying like an aeroplane", flyCar.fly());
	}
	
	@Test
	public void whenShowInfoIsExecutedFromFlyingCar() {
		// Given
		FlyingCar flyCar = new FlyingCar();
		// Then
		assertEquals("I have 4 wheels and 2 wings", flyCar.showInfo());
	}
	
}
