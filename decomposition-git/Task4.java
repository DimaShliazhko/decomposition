package by.htp.task.decomposition;
/*
 * 
 * написать метод (методы) для нахождения НОK четырех натуральных чисел
 */

public class Task4 {

	public static void main(String[] args) {
		int a, b, c, d;
		a = 12;
		b = 9;
		c = 21;
		d = 24;
		int max = max(a, b, c, d);

		nok(a, b, c, d, max);

	}

	public static int max(int a, int b, int c, int d) {
		int max;
		int max1 = Math.max(a, b);
		int max2 = Math.max(c, d);
		return max = Math.max(max1, max2);

	}

	public static void nok(int a, int b, int c, int d, int max) {

		for (int i = max;; i++) {

			if (i % a == 0 && i % b == 0 && i % c == 0 && i % d == 0) {
				System.out.println("НОК равен = " + i);
				break;
			}
		}
	}
}
