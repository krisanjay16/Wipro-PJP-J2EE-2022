import java.util.*;

public class Assignment1a {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int i=sc.nextInt();
		sc.close();
		if(i==0) {
			System.out.print("Zero");
		}
		if(i<0) {
			System.out.print("Negative");
		}
		if(i>0) {
			System.out.print("Positive");
		}
	}
	
}
