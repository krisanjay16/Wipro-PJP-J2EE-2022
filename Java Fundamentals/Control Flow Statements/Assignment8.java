import java.util.*;

public class Assignment8 {
	public static void main(String args[]) {
		System.out.print("Enter the Colour Code: ");
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		sc.close();
		switch(a){
		case 'r':
		case 'R':
			System.out.print("Red"); break;
		case 'b':
		case 'B':
			System.out.print("Blue"); break;
		case 'g':
		case 'G':
			System.out.print("Green"); break;
		case 'o':
		case 'O':
			System.out.print("Orange"); break;
		case 'y':
		case 'Y':
			System.out.print("Yellow"); break;
		case 'w':
		case 'W':
			System.out.print("White"); break;
		default:
			System.out.print("Invalid Code");
		}
	}
}
