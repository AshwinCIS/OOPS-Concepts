package OOPS;

abstract class Shape{
	abstract void draw();
	
	void display() {
		System.out.println("Displaying shape...");
	}
}

class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("Drawing circle..");
		
	}	
}

public class Abstract {

	public static void main(String[] args) {

		Shape d = new Circle();
		
		d.draw();
		d.display();

	}

}
