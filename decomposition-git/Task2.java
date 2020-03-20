package by.htp.task.decomposition;

/*написать метод (методы) для нахождения наибольшего общего делителя
 * и наименьшего общего кратного двух натуральных чисел
 * 
 * НОК (а,б) = а*б / НОД (а,б)
 */
public class Task2 {

	public static void main(String[] args) {
		int nok;
		int nod;
		int a;
		a = 12;
		int b;
		b = 9;
		// System.out.println("a");
		nod = nod(a, b);
		nok = nok(a, b);
		System.out.println("НОД = " + nod);
		System.out.println("НОK = " + nok);

	}

	public static int nod(int a, int b) {
		int n = 0;

		if (a > b) {
			for (int i = a; i >= 1; i--) {

				if (a % i == 0 && b % i == 0) {
					n = i;
					// System.out.println("НОД1 = "+i);
					break;
				}

			}
		} else {

			for (int i = b; i >= 1; i--) {

				if (a % i == 0 && b % i == 0) {
					n = i;
					// System.out.println("НОД2 = "+i);
					break;
				}

			}
		}

		return n;
	}

	public static int nok(int a, int b) {

		int nok = (a * b) / nod(a, b);
		return nok;
	}

}
