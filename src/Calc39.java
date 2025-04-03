public class Calc39 {
    public static void main(String[] args){
        int a;  //Сторона равностороннего треугольника
        double s;  //Площадь
        double h;  //Высота
        double R;  //Радиус описанной окружности
        double r;  //Радиус вписанной окружности

        a = 8;

        s = (Math.sqrt(3) / 4) * Math.pow(a, 2);
        System.out.println("Площадь равностороннего треугольника равна " + s);

        h = (Math.sqrt(3) / 2) * a;
        System.out.println("Высота равностороннего треугольника равна " + h);

        R = a / Math.sqrt(3);
        System.out.println("Радиус описанной окружности равностороннего треугольника равен " + R);

        r = a / (2 * Math.sqrt(3));
        System.out.println("Радиус вписанной окружности равностороннего треугольника равен " + r);
    }
}
