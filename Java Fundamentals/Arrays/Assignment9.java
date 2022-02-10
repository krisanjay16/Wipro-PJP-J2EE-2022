
public class Assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print the given array
		int[] array = {10,2,10};
		System.out.print("Given Array: ");
		for (int element: array) {
            System.out.print(element+" ");
        }
		System.out.println();
		
		//swap with 10
		
		for(int i=0;i<array.length-1;i++) {
			if(array[i]==10) {
				for(int j=i+1;j<array.length;j++) {
					if(array[j]==10) {
					}
					else {
						int temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
			}
		}
		
		//replace '10' with '0'
		
		for(int i=0;i<array.length;i++) {
			if(array[i]==10) {
				array[i]=0;
			}
		}
		
		//print swapped
		System.out.print("Output Array: ");
		for (int element: array) {
            System.out.print(element+" ");
        }
		System.out.println();
		}
}
