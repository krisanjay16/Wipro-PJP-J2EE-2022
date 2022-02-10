import java.util.*;
public class Assignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		int count=0;
		if(num==0||num==1) {
			count++;
		}else{
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					count++;break;
				}
			}
			if(count==0) {
				System.out.print("Prime Number");
			}
			else {
				System.out.print("Not a Prime");
			}
		}
	}

}
