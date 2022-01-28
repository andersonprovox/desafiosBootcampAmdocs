import java.util.Scanner;

public class FatorialSimples {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      int fatorial = scan.nextInt();

      for (int i = fatorial; i > 1; i--) {

          if(fatorial <= 1) {
              fatorial = 1;
          } else {
              fatorial *=  (i - 1);
          }
      }
        System.out.println(fatorial);
    }
}
