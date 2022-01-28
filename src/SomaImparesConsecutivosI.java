import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class SomaImparesConsecutivosI
{
    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int numero1 = sc.nextInt();
            int numero2 = sc.nextInt();
            int soma = 0;

            if(numero1 == numero2) {
                System.out.println(soma);
            } else if(numero1 > numero2) {

               for (int i = --numero1; i > numero2; --i){
                   if(i %2 != 0) {
                       soma+= i;
                   }
               }
               System.out.println(soma);
            } else {
                for(int j = ++numero1; j < numero2; ++j){
                    if(j %2 != 0) {
                        soma+= j;
                    }
                }
                System.out.println(soma);
            }

        }
        sc.close();

    }
}
