package by.htp.task.decomposition;

/*
 * написать методы определяющие в каком из данных двух чисел больше цифр
 * 
 */
public class Task14 {
	public static void main(String[] args) {
		int a, b;
		a = 12345678;
		b = 123451111;

		rez(a, b);

	}

	public static void rez(int a, int b) {
		String a1 = Integer.toString(a);
		String b1 = Integer.toString(b);

		if (a1.length() > b1.length()) {
			System.out.println("цифр в числе " + a + " больше чем в " + b);
		} else {
			System.out.println("цифр в числе " + b + " больше чем в " + a);
		}
	}

}
