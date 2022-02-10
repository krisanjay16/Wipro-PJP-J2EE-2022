import java.util.Scanner;

public class Assignment9 {
	
	static String mergeStrings(String str1, String str2) {
		String bigStr = str1.length() > str2.length() ? str1 : str2;
		String smallStr = str1.length() < str2.length() ? str1 : str2;
		String outStr = "";

		for (int i = 0; i < smallStr.length(); i++) {
			outStr += str1.charAt(i);
			outStr += str2.charAt(i);
		}
		//Concatenate characters which're left of bigString
		outStr += bigStr.substring(smallStr.length(), bigStr.length());
		
		return outStr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the 1st string: ");
		String a = scan.nextLine();
		System.out.print("Enter the 2nd string: ");
		String b = scan.nextLine();
		scan.close();
		
		System.out.print(mergeStrings(a, b));
	}

}
