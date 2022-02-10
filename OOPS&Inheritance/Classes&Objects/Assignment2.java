class Calculator{
	static int powerInt(int Num1,int Num2) {
		return (int) Math.pow(Num1,Num2);
	}
	static double powerDouble(double Num1,int Num2) {
		return Math.pow(Num1,Num2);
	}
}
public class Assignment2 {
	public static void main(String[] args) {
		System.out.println("Integer Power: "+Calculator.powerInt(2,2));
		System.out.print("Double Power: "+Calculator.powerDouble(2.0,2));
		
		
		
	}

}
