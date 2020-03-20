package by.htp.task.decomposition;

/*даны числа x,y,z,t - длины сторон четырехугольника. написать
 * метод вычисления его площади елси угол между сторонами x,y- прямой
 * 
 * 
 */

public class Task12 {

	public static void main(String[] args) {
		int a, b, c, d;
		a = 4;
		b = 3;
		c = 4;
		d = 5;
		// double gip = gip(a,b);
		double sad;
		sad = sab(a, b);
		double scd;
		scd = scd(a, b, c, d);
		double sSum;
		sSum = sSum(sad, scd);// общая сумма
		System.out.println("Сумма равна " + sSum);
	}

	public static double gip(int a, int b) {// гипотенуза

		return Math.sqrt(a * a + b * b);
	}

	public static double sab(int a, int b) { // площадь треугольника 1

		return 0.5 * a * b;
	}

	public static double scd(int a, int b, int c, int d) { // площадь треугольника 2
		double p;
		p = (c + d + gip(a, b)) / 2;

		return Math.sqrt(p * (p - c) * (p - d) * (p - gip(a, b)));
	}

	public static double sSum(double sad, double scd) {

		return sad + scd;
	}

}
