
public class Assignment11 {
	public static void main(String[] args) {
		int[] array = {1,4,4,2};
		System.out.print("Given Array: ");
		for (int element: array) {
            System.out.print(element+" ");
        }
		System.out.println();
		
		//check any other elements exist other than 1 or 4
		int flag=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==1||array[i]==4) {
				flag=0;
			}
			else {
				flag=1;
				break;
			}
		}
		
		if(flag==1) {
			System.out.print(false);
		}
		else {
			System.out.print(true);
		}
	}

}
