import java.util.*;
public class Assignment4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first Character: ");
		char a=sc.next().charAt(0);
		System.out.print("Enter the Second Character: ");
		char b=sc.next().charAt(0);
		sc.close();
		if(a<b) {
			System.out.print(a+","+b);
		}
		else {
			System.out.print(b+","+a);
		}		
	}
}
