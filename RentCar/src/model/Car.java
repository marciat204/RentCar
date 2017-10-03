package model;

public class Car {
	
	private String plate;
	private String brand;
	private String color;
	private String style;
	private float fare;
	
	public Car(String plate, String brand, String color, String style, float fare) {
		this.plate = plate;
		this.brand = brand;
		this.color = color;
		this.style = style;
		this.fare = fare;
	}
	
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public float getFare() {
		return fare;
	}
	public void setFare(float fare) {
		this.fare = fare;
	}

}
