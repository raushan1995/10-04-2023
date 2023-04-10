import java.util.Arrays;

public class Array {

	public static void main(String args[])
	{
		int[] arr = {5,-2,23,7,87};
		System.out.println("original array: ");
		for(int num : arr){
			System.out.print(num + " ");
		}
		Arrays.sort(arr);
		System.out.println("\nThe sorted array is: ");
		for(int num : arr) {
			System.out.print(num+ " ");
		}
	}
}
