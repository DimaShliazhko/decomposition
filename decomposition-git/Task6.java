package by.htp.task.decomposition;
/*
 * 
 * вычислить площадь правильного шестиугольника со стороной а,
 * исрользуя метод вычисления площади треугольника
 */

public class Task6 {

	public static void main(String[] args) {

		int a = 5;
		double s1 = st(a);
		s(s1);
	}

	public static double st(int a) {
		return (a * a * Math.sqrt(3)) / 4;
	}

	public static void s(double a) {
		System.out.println("площадь равна " + (a * 6));
	}
}
