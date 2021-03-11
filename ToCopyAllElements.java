package assesment_02;

public class ToCopyAllElements {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4};
		int arr2[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		
System.out.println(arr2[i]);
	}

}
}