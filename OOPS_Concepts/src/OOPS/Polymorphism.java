package OOPS;

class Scootyy{
	
//	private String model;
//	private int gear;
	
	public void Display(){
		System.out.println("Scooty class");
	}
	
	
	public void Display(String model, int gear) {  //overloading method
		
		System.out.println(model + " " + gear);
	}
	
}

class Gearbikee extends Scootyy{
	
	 
	 @Override
	 public void Display() {
		 super.Display();
		 System.out.println("gearbike class");
	 }
	 

}

public class Polymorphism {

	public static void main(String[] args) {
		
		Gearbikee gear = new Gearbikee();
		
		gear.Display();
		gear.Display("Honda", 5); //overloading
		
	}

}
