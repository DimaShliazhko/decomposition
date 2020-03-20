package by.htp.task.decomposition;
/*
 * 
 * написать метод (методы ) для вычисления факториалов всех нечетных чисел от 1 до 9
 */

public class Task10 {
	
	public static void main(String[] args) {
		int n;
		n =9;
		numberDetermination(n);
		
		
			
		}
	
	
	public static void numberDetermination(int n) {
		for (int i = 1; i <= 9; i++ ) {
			if (i % 2 !=0 ) {
				fac(i);
			}
		
	}
	}
	
	public static void fac(int i) {
		int p = 1;
		for (int j = 1; j <=i ;j++) {
			p = p*i;
		}
		System.out.println("факториал "+i+" равен "+p);		
	}
	
}

