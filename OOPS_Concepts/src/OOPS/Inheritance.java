package OOPS;


class Scooty{
	private String brand;
	private int year;
	
//	public Scooty(String brand, int year){
//		this.brand = brand;
//		this.year = year;
//	}
	
	public void Display(){
		System.out.println("Scooty class");
	}
	
	public void setbrand(String brand) {
		this.brand = brand;
	 }
	public void setyear(int year) {
		this.year = year;
	}
	
	public String getbrand() {
		return brand;
		
	}
	public int getyear() {
		return year;
		
	}
	
}

class Gearbike extends Scooty{
	 private String gear;
	 
	 public void Display() {
		 super.Display();
		 System.out.println("gearbike class");
	 }
	 
	 public void setGear(String gear) {
		 this.gear = gear;
		 
	 }
	 
	 public String getGear() {
		 return gear;
	 }
}

public class Inheritance {

	public static void main(String[] args) {
		//Scooty details = new Scooty("Yamaha", 2000);
		Gearbike gear = new Gearbike();
		gear.setGear("Gear vehicle");
		gear.setbrand("Yamaha");
		gear.setyear(2000);
		gear.Display();
		System.out.println("Brand name is: " + gear.getbrand());
		System.out.println("year is: " + gear.getyear());
		System.out.println("Gear/Non gear: " + gear.getGear());

	}

}
