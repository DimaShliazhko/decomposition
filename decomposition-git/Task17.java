package by.htp.task.decomposition;
/*
 * натуральное число, в записи которого n цифр называется числом Армстронга,
 * если сумма его цифр ,возведенная в степень n равна самому числу. найти все числа Армстронка от 1 до k
 * использовать декомпозицию
 * 
 */

public class Task17 {

	public static void main(String[] args) {
		int k;
		k = 500;
		armstrong(k);
	}

	public static void armstrong(int k) {
		int i;
		for (i = 1; i <= k; i++) {
			double sum;
			sum = 0;
			String n = Integer.toString(i);
			int a;
			a = i;
			for (int j = 1; j <= n.length(); j++) {

				sum = sum + Math.pow((a % 10), n.length());
				// System.out.println(i+"+= "+sum);
				a = a / 10;

			}
			if (i == sum) {
				System.out.println("число " + i + " является числом Армстронга");
			}
		}

	}

}
