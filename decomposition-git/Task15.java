package by.htp.task.decomposition;

/*
 * даны натуральные числа K и N. написать метод формирования массива A
 * элементами которого являются числа, сумма цифр которых равна K
 * и которые не больше N
 * 
 */
public class Task15 {

	public static void main(String[] args) {

		int k, n;
		k = 10;
		n = 100;
		int[] a1 = creatarr(k, n);
		int kol = karr(a1); // посчитаем нули
		delnullarr(a1, k); // удалим нули из массива
	}

	public static int[] creatarr(int k, int n) {

		int[] a = new int[n];
		String n1 = Integer.toString(n);
		System.out.println("n1 = " + n1);

		for (int i = 1; i <= n; i++) {

			int i1 = i;
			int sum;
			sum = 0;
			for (int j = 1; j < n1.length(); j++) {

				sum = sum + (i1 % 10);
				i1 = i1 / 10;
				// System.out.println("sum = " +sum+" i1 = "+i1);

			}
			if (sum == k) {
				a[i] = i;
				System.out.println("a[" + i + "] = " + a[i]);
			}

		}
		return a;
	}

	/// удалим из массива нули

	public static int karr(int[] a) {
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				k++;

			}
		}
		System.out.println("k = " + k);
		return k;
	}

	public static void delnullarr(int[] a, int k) {
		int j;
		j = 0;
		int[] arr = new int[k];
		for (int i = 0; i < a.length; i++) {

			if (a[i] != 0) {
				/*
				 * for (int j = 0; j < arr.length; j++) { arr[j] = a[i];
				 */
				// System.out.println(+a[i]);
				arr[j] = a[i];

				System.out.println(j + "-ый элемент массива A равен = " + arr[j]);
				j++;
			}
		}

	}

}
