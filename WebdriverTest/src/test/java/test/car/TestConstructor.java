package test.car;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Car;

class TestConstructor {

	@Test
	void testNullMake() {
		assertThrows(IllegalArgumentException.class, () -> new Car(null, "Avalon")
		);
	}
	
	@Test
	void testNullModel() {
		assertThrows(IllegalArgumentException.class, () -> new Car("Honda", null)
		);
	}
	
	@Test
	void testValidData() {
		Car testCar = new Car ("Honda", "Avalon");
		
		assertEquals("Honda", testCar.getMake());
		assertEquals("Avalon", testCar.getModel());
	}
	
	@Test
	void testFailingData()
	{
		assertEquals(1, 1);
	}
}
