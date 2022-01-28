import java.util.Locale;
import java.util.Scanner;

public class FibonacciRapido {
    static double fibonacci(double n) {

        double resultado = 0;

        resultado = (Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5);
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numNatural = sc.nextInt();

        System.out.println(String.format("%.1f", fibonacci(numNatural)));
    }
}