import java.util.*;
public class Assignment8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		scan.close();
		String[] stars = str.split(".[\\*]+.");
		StringBuffer sb = new StringBuffer();
		for (String x : stars)
			sb.append(x);
		System.out.println(sb);
	}
}
