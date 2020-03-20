package by.htp.task.decomposition;

/*
 * написать метод (методы) для нахождения НОД четырех натуральных чисел
 * 
 */

public class Task3 {

	public static void main(String[] args) {

		int a, b, c, d;
		a = 12;
		b = 9;
		c = 24;
		d = 21;
		int max = max(a, b, c, d);
		nod(a, b, c, d, max);

	}

	public static int max(int a, int b, int c, int d) {
		int max;
		int max1 = Math.max(a, b);
		int max2 = Math.max(c, d);
		return max = Math.max(max1, max2);

	}

	public static void nod(int a, int b, int c, int d, int max) {

		for (int i = max; i >= 1; i--) {

			if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
				System.out.println("НОД чисел" + a + " " + b + " " + c + " " + d + " = " + i);
				break;
			}
		}

	}

}
