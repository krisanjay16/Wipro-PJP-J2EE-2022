class Shape{
	void draw(){
		System.out.print("Drawing Shape..");
	}
	void erase() {
		System.out.print("Erasing Shape..");
	}

}

class Circle extends Shape{
	void draw(){
		System.out.print("Drawing Circle..");
	}
	void erase() {
		System.out.print("Erasing Circle..");
	}
	
}
class Triangle extends Shape{
	void draw(){
		System.out.print("Drawing Triangle..");
	}
	void erase() {
		System.out.print("Erasing Triangle..");
	}
	
}
class Square extends Shape{
	void draw(){
		System.out.print("Drawing Square..");
	}
	void erase() {
		System.out.print("Erasing Square..");
	}
}
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c = new Circle();
		Shape t = new Triangle();
		Shape s = new Square();
		
		c.draw();System.out.println();
		c.erase();System.out.println();
		t.draw();System.out.println();
		t.erase();System.out.println();
		s.draw();System.out.println();
		s.erase();System.out.println();

	}

}
