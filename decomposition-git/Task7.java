package by.htp.task.decomposition;

/*
 * 
 * на плоскости заданы своими координатами n точек.
 * написать метод (методы), определяющие между какими из пар точек
 * самое большое расстояние. Указание. координаты точек занести в массив
 * 
 * 
 */
public class Task7 {

	public static void main(String[] args) {
		int n;
		n = 10;

		int[] x = new int[n];
		int[] y = new int[n];

		for (int i = 0; i < x.length; i++) {
			x[i] = i;
			y[i] = i;

		}
		for (int i = 0; i < x.length; i++) {
			x[i] = i;
			y[i] = i;
			System.out.println("x[" + i + "]= " + x[i] + "   y[" + i + "]= " + y[i]);
		}

		char xx, yy;
		xx = 'x';
		yy = 'y';

		len(x, xx);
		len(y, yy);

	}

	public static void len(int[] x, char str) {
		double len = 0;
		int xi = 0;
		int xj = 0;

		int max;
		max = 0;
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = i + 1; j < x.length; j++) {
				int a = x[j] - x[i];
				// System.out.println("a = "+a);
				if (max < a) {

					max = a;
					xi = i;
					xj = j;
				}
			}

		}

		System.out.println(" максимальное расстояние  между точками с координатами " + str + "[" + xi + "]" + "  " + str
				+ "[" + xj + "]");
		// return max;
	}

}
