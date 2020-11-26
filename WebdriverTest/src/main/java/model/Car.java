package model;

public class Car {
	private String make;
	private String model;
	
	public Car (String make, String model) {
		if(make == null) {
			throw new IllegalArgumentException("make cannot be null");
		}
		
		if(model == null) {
			throw new IllegalArgumentException("model cannot be null");
		}
		
		this.make = make;
		this.model = model;
	}
	
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}
}
