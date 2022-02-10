import java.util.*;
public class Assignment14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		int count=0;
		while(num>0) {
			int temp=num;
			num=num%10;
			count+=num;
			num=temp/10;
			}
		System.out.print(count);
		}
            

}
