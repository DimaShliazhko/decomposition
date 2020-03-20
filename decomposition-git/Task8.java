package by.htp.task.decomposition;
/*
 * 
 * Составить программу , которая в массиве a[n] находит второе по величине число (вывести на печать число,
 * которое меньше максимального элемента массива, но больше всех других элементов)
 */

public class Task8 {
	public static void main(String[] args) {
		// int n;
		// n = 10;

		int[] x = new int[] { 1, 20, 5, 6, 7, 8, 9, 11, 21, 0 };

		max2(x);
	}

	public static void max2(int[] x) {

		for (int i = x.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				if (x[j] > x[j + 1]) {
					int tmp = x[j];
					x[j] = x[j + 1];
					x[j + 1] = tmp;
				}
			}

		}
		System.out.println(x[x.length - 2]);

	}
}
