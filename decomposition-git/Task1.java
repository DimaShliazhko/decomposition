package by.htp.task.decomposition;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
/*
 * треугольник задан координатами своих вершин.
 * написать метод для вычисления его площади
 * 
 */

public class Task1 {
	
	public static void main(String[] args) {
		int x1,x2,x3,y1,y2,y3;
		double s,p, d1,d2,d3;
		x1 =1;
		y1 =1;
		x2 = 3;
		y2 = 3;
		x3 = 5;
		y3 = 1;
		d1 = d(x1,x2,y1,y2);
		d2 = d(x2,x3,y2,y3);
		d3 = d(x3,x1,y3,y1);
		p = p(d1,d2,d3);
		s = s(p,d1,d2,d3);
	//	System.out.println("d1 ="+getD(d1)+"d2 ="+getD(d2)+"d3 ="+getD(d3));
	
		
		
		 System.out.println("Площадь треугольника равна  " + s);
		
	}
	
	public static double d(int x1,int x2,int y1,int y2) {
		double d  =   sqrt(pow(x2 - x1, 2) + pow (y2 - y1,2));
		return d;
	} 
	public static void getD(int d) {
		System.out.println(d);
	} 
	
	public static double p(double d1,double d2,double d3) {
		
		double p = (d1+d2+d3) / 2;
			
		return p;
			
	}
	public static double s (double p, double d1,double d2,double d3) {
		double s = sqrt(p* (p-d1) * (p-d2)* (p-d3)) ;
		return s;
	}
	
}

