package jc01_lesson03;

public class Calc32 {

	public static void main(String[] args) {
		int x1;   // Объявляем координаты
		int x2;
		int y1;
		int y2;
		double rez;
		
		x1 = 2;   // Присваиваем значения
		y1 = 3;
		x2 = 5;
		y2 = 6;
		
		rez = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2-y1), 2));  // Вычисляем расстояние между 2 точками по формуле
		System.out.println(" Расстояние между двумя точками равно " + rez);
		
		

	}

}
