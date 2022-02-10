import java.util.*;
public class Assignment7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {12, 34, 12, 45, 67, 89};
		System.out.print("Given Array: ");
		for (int element: array) {
            System.out.print(element+" ");
        }
		System.out.println();
		
		Arrays.sort(array);									
		int[] temp = new int[array.length];
		int j = 0;											
		for (int i = 0; i < array.length-1; i++){
			if (array[i] != array[i+1]){
				temp[j++] = array[i];  
			}
		}
		temp[j++] = array[array.length-1];
		System.out.print("Duplication Removed: ");
		for (int i = 0; i < j; i++){
			System.out.print(temp[i]+" ");  				
		}
	}
	}

