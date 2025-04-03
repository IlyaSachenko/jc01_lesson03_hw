public class Calc35 {
    public static void main(String[] args) {
        int n = 4;
        String nStr = String.valueOf(Math.PI).replace(".", "");

        if (nStr.length() >= n) {
            String result = nStr.substring(0, n);
            System.out.println("Первые " + n + " цифры: " + result);
        } else {
            System.out.println("Число содержит меньше " + n + " цифр.");
        }
    }
}
