package by.htp.task.decomposition;
/*
 * Из заданного числа вычли сумму его цифр. из результата числа вновь
 * вычли сумму цифр и т.д.
 * сколько таких действий надо произвести чтобы получился нуль?
 * 
 */

public class Task20 {

	public static void main(String[] args) {
		int a;
		a = 11;

		// a = sumNumb(a);
		// System.out.println( a);
		cycle(a);

	}

	public static int sumNumb(int a) {

		String str = Integer.toString(a);
		int sum;
		sum = 0;
		int suma;
		suma = a;

		for (int i = 1; i <= str.length(); i++) {

			sum = sum + a % 10;

			// System.out.println("a % 10 " + (a % 10));
			/// System.out.println( sum);
			a = a / 10;
		}
		System.out.println("стоп");
		return suma - sum;
	}

	public static void cycle(int a) {
		int k = 0;

		while (a >= 0) {
			System.out.println("a= " + a);
			if (a > 0) {

				a = sumNumb(a);
				k++;
			} else {
				System.out.println("Понадобилось " + k + " циклов");
				break;
			}

		}

	}
}
