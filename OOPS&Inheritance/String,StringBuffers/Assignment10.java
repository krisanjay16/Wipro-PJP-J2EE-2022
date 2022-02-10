import java.util.*;
public class Assignment10 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String string=scanner.nextLine();
		System.out.print("Enter the Number: ");
		int n=scanner.nextInt();
		scanner.close();
		String repStr = string.substring(string.length()-n);				//substring(beginIndex)
		String outStr = "";
		
		for(int i = 0; i  < n; i++) {
			outStr += repStr;
		}
		System.out.print(outStr);
	}
}
