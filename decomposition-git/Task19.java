package by.htp.task.decomposition;

/*
 * написать программу, определяющую сумму n-значных чисел,
 * содержащих только нечетные цифры.
 * определить также сколько четных цифр в найденной сумме
 * использовать декомпозицию
 * 
 */

public class Task19 {
	public static void main(String[] args) {
		int[] n = new int[] { 123, 111, 335, 135, 134 };
		int[] k = arrDelEvenNumber(n);

		print(k);
		int sum = sum(k);
		printSum(sum);
		sum = sumEvenNumber(sum);
		printSum(sum);

		// System.out.println("int k = " + k);

	}

	public static int[] arrDelEvenNumber(int[] n) {

		int[] a = new int[n.length];
		for (int i = 0; i < n.length; i++) {

			String str = Integer.toString(n[i]);
			a[i] = n[i];
			for (int j = 1; j <= str.length(); j++) {

				if ((a[i] % 10) % 2 == 0) {

					System.out.println("цифра " + (a[i] % 10) + "  четная");
					n[i] = 0;
					System.out.println("n[i]  = " + n[i]);
					break;

				} else {
					System.out.println("цифра " + (a[i] % 10) + "  нечетная");
				}

				a[i] = a[i] / 10;
			}

		}

		return n;
	}

	public static void print(int[] k) {
		for (int i = 0; i < k.length; i++) {
			System.out.println("k[i] = " + k[i]);
		}
	}

	public static int sum(int[] k) {
		int sum;
		sum = 0;
		for (int i = 0; i < k.length; i++) {
			sum = sum + k[i];
		}

		return sum;
	}

	public static void printSum(int sum) {
		System.out.println("Сумма чисел содержащие нечетные цифры равна " + sum);
	}

	public static int sumEvenNumber(int sum) {
		int s = 0;
		String str = Integer.toString(sum);
		for (int i = 1; i <= str.length(); i++) {
			if ((sum % 10) % 2 == 0) {
				s = s + sum % 10;
			}
			sum = sum / 10;
		}
		return s;

	}
}
