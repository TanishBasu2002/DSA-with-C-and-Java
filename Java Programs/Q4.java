import java.util.*;
public class Q4 {
    public static int random(int a) {
		int i;
		int num = (RANDOM.nextInt() & Integer.MAX_VALUE) % (a + 1);
		return num;
	}

	public static int function(int n) {
		int i;

		if(n <= 0) {
			return 0;
		} else {
			i = random(n - 1);
			System.out.println("this");
			return function(i) + function(n - 1 - i);
		}
	}

	public static void main(String[] args) {
		function(6);
	}

	public final static Random RANDOM = new Random(1);
}
