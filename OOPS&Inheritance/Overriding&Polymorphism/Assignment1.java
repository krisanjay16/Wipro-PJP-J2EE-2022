class Fruit {
	String name, taste, size;
	
	void eat() {
		System.out.println("Eating Fruits...");
	}
}

class Apple extends Fruit {
	
	Apple() {
		name = "Apple";
		taste = "little sweet and a little tart";
	}
	
	@Override
	void eat() {
		System.out.println(name + " is "+ taste + " in taste.");
	}
}

class Orange extends Fruit {
	
	Orange() {
		name = "Orange";
		taste = "juicy with a rich and sweet but mildly tart";
	}
	
	@Override
	void eat() {
		System.out.println(name + " is "+ taste + " in taste.");
	}	
}
public class Assignment1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit fruit = new Fruit();
		Apple apple = new Apple();
		Orange orange = new Orange();
		fruit.eat();
		apple.eat();
		orange.eat();
		
	}

}
