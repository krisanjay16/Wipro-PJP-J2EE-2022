import java.util.*;
public class Assignment7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char var = sc.next().charAt(0);
		sc.close();
		if (var >= 'a' && var <= 'z')
			System.out.println(var+"->"+(char)(var-32));				
	     else
	    	 System.out.println(var+"->"+(char)(var+32)); 			
	}

}
