package jc01_lesson03;

public class Cacl31 {

	public static void main(String[] args) {
		int a; // Первый катет
		int b; // Второй катет
		double c; // Гипотенуза

		int s; // Площадь
		double p; // Периметр

		a = 2;
		b = 4;
		s = (a * b) / 2; // Вычисляем площадь

		System.out.println(" Площадь прямоугольного треугольника равна " + s); 

		c = Math.sqrt(a * a + b * b); // Для вычисления периметра найдём гипотенузу
		p = a + b + c;   // Вычисляем периметр
		System.out.println(" Периметр прямоугольного треугольника равен " + p);

	}

}
