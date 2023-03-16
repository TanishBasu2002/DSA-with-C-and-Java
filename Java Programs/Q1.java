package Q1;

public class Q1 {
	public static void func1(int[] array, int length) {
		int sum = 0;
		int product = 1;
		for(int i = 0; i < length; i++) {
			sum += array[i];
		}
		for(int i = 0; i < length; i++) {
			product *= array[i];
		}
	}

	public static void main(String[] args) {
		int[] arr = {3, 5, 66};
		func1(arr, 3);
        System.out.println("OK");
	}
}