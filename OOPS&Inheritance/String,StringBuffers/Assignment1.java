import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		String Word,Rev="";
		char ch;
		Scanner sc=new Scanner(System.in);
		Word=sc.nextLine();
		sc.close();
		for (int i=0; i<Word.length(); i++)
	      {
	        ch= Word.charAt(i); 
	        Rev= ch+Rev; 
	      }
		if(Word.equals(Rev)) {
			System.out.print("Palindrome");
		}
		else {
			System.out.print("Not a Palindrome");
		}
	}

}
