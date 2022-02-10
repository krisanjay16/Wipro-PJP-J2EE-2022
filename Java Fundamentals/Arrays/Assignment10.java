class Assignment10{
	public static void main(String[] args) {
		
		//given array
		
		int[] array = {3,3,2};
		int[] temp=new int[array.length];
		System.out.print("Given Array: ");
		for (int element: array) {
            System.out.print(element+" ");
        }
		System.out.println();
		
		//initial for temp array
		
		int j=0;
		
		//add even elements to temp array
		
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				temp[j++]=array[i];
			}
		}
		
		//add odd elements to temp array
		
		for(int i=0;i<array.length;i++) {
			if(array[i]%2!=0) {
				temp[j++]=array[i];
			}
		}
		
		//print the temp array
		
		System.out.print("Output Array: ");
		for (int element: temp) {
            System.out.print(element+" ");
        }
		System.out.println();
		
		
	}
}