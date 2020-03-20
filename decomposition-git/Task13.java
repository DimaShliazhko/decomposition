package by.htp.task.decomposition;
/*
 * 
 * дано натуральное число N написать методы ля формирования массива,
 * элементами которого являются цифры числа N
 */

public class Task13 {

	public static void main(String[] args) {
		int n;
		n = 12345678;
		int[] a = arr(n);
		printarr(a, n);
	}

	public static int[] arr(int n) {

		String n1 = Integer.toString(n);
		int[] a = new int[n1.length()];
		for (int i = n1.length() - 1; i >= 0; i--) {
			a[i] = n % 10;
			n = n / 10;
			// System.out.println(a[i]);
		}
		return a;
	}

	public static void printarr(int[] a, int n) {
		String n1 = Integer.toString(n);
		for (int i = 0; i < n1.length(); i++) {

			System.out.println("a[" + i + "] =  " + a[i]);
		}
	}

}
