package by.htp.task.decomposition;
/*
 * 
 * написать метод (методы) проверяющи являются ли данные три числа взаимно простыми
 */

public class Task9 {

	public static void main(String[] args) {
		int a, b, c;
		a = 3;
		b = 11;
		c = 17;

		int max = max(a, b, c);
		vzpr(a, b, c);

	}

	public static void vzpr(int a, int b, int c) {
		int k = 0;
		for (int i = 1; i < max(a, b, c); i++) {

			if (a % i == 0 && b % i == 0 && c % i == 0) {
				k++;
				System.out.println("i = " + i);
			}

		}
		if (k == 1) {
			System.out.println("все 3 числа взаимопростые");
		}
	}

	public static int max(int a, int b, int c) {
		int max;
		max = Math.max(a, b);
		max = Math.max(max, c);

		return max;
	}
}
