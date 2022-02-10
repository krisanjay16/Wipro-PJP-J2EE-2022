import java.util.*;
public class Assignment2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the 1st string: ");
		String str1 = scan.nextLine();
		System.out.print("Enter the 2nd string: ");
		String str2 = scan.nextLine();
		scan.close();
		char ch1=str1.charAt(0);
		char ch2=str2.charAt(0);
		if((Character.isUpperCase(ch1))&&(Character.isUpperCase(ch2))) {
			System.out.println(str1.toLowerCase()+" "+str2.toLowerCase());
		}else {
			System.out.print(str1.toLowerCase()+str2.toLowerCase());
		}
	}

}
