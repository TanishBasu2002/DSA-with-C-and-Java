public class Q3 {
    public static void func(int n) {
		int sum = 0;
		int product = 1;
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				System.out.println(i + " , " + j);
			}
		}
	}

	public static void main(String[] args) {
		func(4);
	}
}
