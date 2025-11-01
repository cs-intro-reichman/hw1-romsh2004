// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// % java Ascend 100
		// 91 3 38
		// 3 38 91
		int n = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * n);
		int b = (int) (Math.random() * n);
		int c = (int) (Math.random() * n);
		int min = Math.min(a, Math.min(b, c));
		int max = Math.max(a, Math.max(b, c));
		int mid = a + b + c - min - max;
		System.out.println(a + " " + b + " " + c);
		System.out.println(min + " " + mid + " " + max);
	}
}
