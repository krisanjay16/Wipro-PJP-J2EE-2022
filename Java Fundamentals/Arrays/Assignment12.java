
public class Assignment12 {
	public static void main(String[] args) {
		int[] a= {7,7,7};
		int[] b= {3,8,0};
		int[] temp=new int[2];
		temp[0]=a[1];
		temp[1]=b[1];
		String Space="";
		for(int i=0;i<temp.length;i++) {
			System.out.print(Space+temp[i]);
			Space=",";		}
	}
}