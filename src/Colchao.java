import java.io.IOException;
import java.util.Scanner;

public class Colchao {

    // relacionada ao problema da Beecrowd 2409
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        int H = leitor.nextInt();
        int L = leitor.nextInt();

        if(B < H || B < L || C < H || C < L) {
            System.out.println("S");
        } else
            System.out.println("N");
    }

}
