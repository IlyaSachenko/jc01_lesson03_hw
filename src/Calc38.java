public class Calc38 {
    public static void main(String[] args){

        int a;   //Длина стороны куба
        double s1;  //Площадь грани куба
        double s2;  //Площадь поверхности куба
        double v;   //Объём куба

        a = 5;

        s1 = Math.pow(a, 2);
        System.out.println("Площадь грани куба равна " + s1);

        s2 = s1 * 6;
        System.out.println("Площадь поверхности куба равна " + s2);

        v = Math.pow(a, 3);
        System.out.println("Объём куба равен " + v);

    }
}
