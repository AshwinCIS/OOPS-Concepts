package OOPS;

public class Encapsulation {
	
	private String brand;
	private int year;
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation car = new Encapsulation();

		car.setBrand("BMW");
		car.setYear(2025);
		
		System.out.println("Brand: " + car.getBrand());
		System.out.println("year: " + car.getYear());
		
		
	}

}
