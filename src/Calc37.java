public class Calc37 {
    public static void main(String[] args){

        int x;
        int y;

        double rez1;
        double rez2;

        x = 5;
        y = 3;

        rez1 = (Math.pow(x, 3) + Math.pow(y, 3)) / 2;
        System.out.println("Среднее арифметическое кубов чисел x и y равно = " + rez1);

        rez2 = Math.sqrt(Math.abs(x) * Math.abs(y));
        System.out.println("Среднее геометрическое модулей чисел x и y равно = " + rez2);

    }
}
