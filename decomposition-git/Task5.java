package by.htp.task.decomposition;

/*
 * 
 *  написать методы для нахождения суммы большего и меньшего из 3 чисел
 */

public class Task5 {

	public static void main(String[] args) {
		int a, b, c;
		a = 3;
		b = 6;
		c = 9;

		int max = max(a, b, c);
		int min = min(a, b, c);
		int sum = sum(min, max);
		System.out.println("сумма min + max = " + sum);

	}

	public static int max(int a, int b, int c) {
		int max = 0;
		if (a > b) {
			max = b;
		} else {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		System.out.println("максимальное число " + max);
		return max;
	}

	public static int min(int a, int b, int c) {
		int min = 0;
		if (a < b) {
			min = a;
		} else {
			min = b;
		}
		if (min > c) {
			min = c;

		}
		System.out.println("минимальное число " + min);
		return min;
	}

	public static int sum(int min, int max) {
		return min + max;
	}

}
