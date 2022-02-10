class Animals{
	void eat(){
		System.out.print("Animals Eat");
	}
	void sleep() {
		System.out.print("Animals Sleep");
	}
}
class Birds extends Animals{
	void eat(){
		System.out.print("Birds Eat");
	}
	void sleep() {
		System.out.print("Birds Sleep");
	}
	void fly() {
		System.out.print("Birds Fly");
	}
}
public class Assignment1 {
	public static void main(String[] args) {
		Animals a=new Animals();
		System.out.println("Under Animal Class: ");
		a.eat();
		System.out.println(" ");
		a.sleep();
		System.out.println();
		System.out.println();
		Birds b=new Birds();
		System.out.println("Under Birds Class: ");
		b.eat();
		System.out.println();
		b.sleep();
		System.out.println();
		b.fly();
	} 

}
