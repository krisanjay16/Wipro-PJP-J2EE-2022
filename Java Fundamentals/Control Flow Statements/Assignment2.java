import java.util.*;
public class Assignment2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int i=sc.nextInt();
		sc.close();
		if(i%2==0) {
			System.out.print("Even");
		}
		else {
			System.out.print("Odd");
		}
	}
}
