import java.util.*;
public class Assignment5 {
	public static void main(String[] args) {
		System.out.print("Enter the String: ");
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		scanner.close();
		string=string.substring(1,string.length()-1);
		System.out.print(string);
	}
}
