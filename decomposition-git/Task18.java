package by.htp.task.decomposition;
/*
 * 
 * найдите все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
 * (например 1234 5789) для решения использовать декомпозицию
 */

public class Task18 {
	public static void main(String[] args) {
		int n;
		n = 999; // будем искать 4 значные числа
		posl(n);
	}

	public static void posl(int n) {
		String n1 = Integer.toString(n);

		for (int i = 102; i <= n; i++) {

			// System.out.println(i);
			int[] a = new int[n1.length()];
			int ii;
			ii = i;
			int k;
			k = 0;
			for (int j = n1.length() - 1; j >= 0; j--) {

				a[j] = ii % 10;
				ii = ii / 10;

			}
			for (int j = 0; j < n1.length(); j++) {

				// System.out.println(a[j]);
			}

			for (int j = 0; j < n1.length() - 1; j++) {
				if (a[j + 1] == a[j] + 1) {
					k++;
				}
				if (k == n1.length() - 1) {
					System.out.println("число " + i + " образует возрастающую последовательность");
				}

			}

		}

	}
}
