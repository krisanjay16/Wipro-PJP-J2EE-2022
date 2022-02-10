import java.util.*;
public class Assignment3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 4, 34, 56, 7};
		System.out.print("Enter the search Element: ");
		Scanner sc=new Scanner(System.in);
		int  key = sc.nextInt();
		sc.close();
		int i, flag = 0;
		
		for(i = 0; i < array.length; i++) {
			if(array[i] == key) {
				flag = 1;
				break;
			}
		}
		if(flag == 1) {
			System.out.println(i+1);
		}
		else {
			System.out.println("-1");
		}
	}

}
