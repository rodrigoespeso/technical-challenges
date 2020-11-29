package questions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Tests {
	
	@Test
	public void listNumbersFizzesAndBuzzes_whenInitIsOne_andEndIs100() {
		
		List<String> list = FizzBuzz.listNumbersFizzesAndBuzzes(1, 100);
		       
		assertEquals("Fizz", list.get(2));
		assertEquals("Buzz", list.get(4));
		assertEquals("FizzBuzz", list.get(14));
	}
	
}
