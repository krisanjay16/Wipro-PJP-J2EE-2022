import java.util.*;
public class Assignment4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String string=scanner.nextLine();
		scanner.close();
		if(string.length()%2==0) {
			char[] ch=new char[string.length()/2];
			for (int i = 0; i < string.length()/2; i++) {
				ch[i]=string.charAt(i);
			}
			for (char c : ch) {
				System.out.print(c);
			}
		}else {
			System.out.print("null");
		}
	}
}
