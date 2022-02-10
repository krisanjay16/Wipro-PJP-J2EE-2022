import java.util.*;
public class Assignment3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str=sc.nextLine();
		sc.close();
		int temp=str.length();
		char ch1,ch2;
		ch1=str.charAt(0);
		ch2=str.charAt(1);
		for (int i = 0; i < temp; i++) {
			System.out.print(ch1);
			System.out.print(ch2);
		}
	}
	}
