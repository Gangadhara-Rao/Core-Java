package gangadhar;

public class Shape {
	public static void main(String[] args) {
		Shapes r = new Rectangle();
		r.draw();
	}

}
// creating an abstract class
abstract class Shapes{
	abstract void draw();
}
// every subclass should inherit the abstract method of parent class
class Rectangle extends Shapes{
	void draw() {
		System.out.println("Rectangle");
	}
}
class Line extends Shapes{
	void draw() {
		System.out.println("Line");
	}
}
class Cube extends Shapes{
	void draw() {
		System.out.println("Cube");
		
	}
}
