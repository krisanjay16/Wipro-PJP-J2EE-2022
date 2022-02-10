import java.util.*;
public class Assignment7 {
	public static void main(String[] args) {
		System.out.print("Enter the element: ");
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		scanner.close();
		char[] ch=new char[string.length()];
		for (int i = 0; i < string.length(); i++) {
			ch[i]=string.charAt(i);
		}
		if((ch[0]=='x')&&(ch[string.length()-1]=='x')){
			string=string.substring(1,string.length()-1);
			System.out.print(string);
		}else {
			System.out.print(string);
		}
			
		}
	}
