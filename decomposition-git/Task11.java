package by.htp.task.decomposition;
/*
 * 
 * задан массив D . определить следующие суммы D[1]+D[2]+D[3]; D[3]+D[4]+D[5]; D[4]+D[5]+D[6]
 */

public class Task11 {

	public static void main(String[] args) {
		int n;
		n = 7;
		int[] arr = creatArr(n);
		sumArri(arr, 1,3);
		sumArri(arr, 3,5);
		sumArri(arr, 4,6);

	}

	public static int[] creatArr(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		return arr;

	}

	public static void sumArri(int[] arr, int a,int b) {
		int sum;
		sum = 0;
		for (int i = a; i <= b; i++) {
			sum = sum + arr[i]; 

		}
		System.out.println("Cумма = "+sum);
	}
}
