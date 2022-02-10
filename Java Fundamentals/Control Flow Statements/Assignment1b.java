class lastDigit{
	lastDigit(int a,int b){
		if(a%10==b%10) {
			System.out.print("True");
		}
		else {
			System.out.print("False");
		}
	}
}

public class Assignment1b {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		lastDigit a=new lastDigit(10,11);
	}
}
