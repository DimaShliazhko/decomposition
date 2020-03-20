package by.htp.task.decomposition;

/*
 * два числа называются близнецами если они отличаются друг от друга на 2 (например 41 и 43)
 * найти и напечатать все пары близнецов из отрезка [n, 2n] где n - заданное натуральное число больше 2
 * для решения использовать декомпозицию
 * 
 */
public class Task16 {

	public static void main(String[] args) {
		int n;
		n = 10;

		twins(n);
	}

	public static void twins(int n) {
		for (int i = n; i <= (2 * n) - 2; i++) {
			System.out.println("пары близнецов на отрезке " + n + " " + 2 * n + "  " + i + " и " + (i + 2));

		}

	}

}
