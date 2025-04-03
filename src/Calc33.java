public class Calc33 {
    public static void main(String[] args) {

        int x1;   // Координаты сторон треугольника
        int x2;
        int x3;
        int y1;
        int y2;
        int y3;
        double p;   // Периметр
        double p2;  // Полупериметр для формулы Герона
        double s;   // Площадь

        double l1;  // Стороны треугольника
        double l2;
        double l3;

        x1 = 2;
        y1 = 2;
        x2 = 3;
        y2 = 4;
        x3 = 6;
        y3 = 3;

        l1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));   //Вычисляем длины сторон треугольника
        l2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        l3 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));

        System.out.println("На основании координат получаем длины сторон треугольника:");
        System.out.println("\tl1 = " + l1 + "; l2 = " + l2 + "; l3 = " + l3 + ".");

        p = l1 + l2 + l3;
        System.out.println("\nПериметр треугольника равен " + p);

        p2 = p / 2;   //Вычисляем полупериметр треугольника

        s = Math.sqrt(p2 * (p2 - l1) * (p2 - l2) * (p2 - l3));
        System.out.println("\nПлощадь треугольника, вычисленная по формуле Герона, равна " + s);


    }
}
