public class Saida1 {
    public static void main(String[] args) {
        String tracos = "";
        String barras = "";
        for(int i = 0; i < 39; i++) {
            tracos+= "-";
        }

        for(int i = 0; i <= 39; i++) {
            if(i == 0 || i == 38) {
                barras+= "|";
            }else {
                barras+= " ";
            }
        }

        System.out.println(tracos);
        System.out.println(barras);
        System.out.println(barras);
        System.out.println(barras);
        System.out.println(barras);
        System.out.println(barras);
        System.out.println(tracos);
    }
}
