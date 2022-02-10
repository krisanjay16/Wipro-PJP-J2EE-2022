import java.util.*;
public class Assignment6 {
	public static void main(String args[]) {
		String string1,string2;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the First String: ");
		string1=scanner.nextLine();
		System.out.print("Enter the Second String: ");
		string2=scanner.nextLine();
		scanner.close();
		if(string1.length()<string2.length()) {
			System.out.print(string1+string2+string1);
		}else {
			System.out.print(string2+string1+string2);
		}
	}

}
