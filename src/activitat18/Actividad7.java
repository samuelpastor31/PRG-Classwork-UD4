package activitat18;

import java.util.Scanner;

public class Actividad7 {
    static final Scanner teclado =new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(coincidenCadenas(pedirCadena(1,6),
                pedirCadena(2,2)));
    }
    public static String pedirCadena (int numeroCadena, int longitudMinCadena){
        String cadena;
        do {
            System.out.printf("Introduce cadena%d: ",numeroCadena);
            cadena = teclado.nextLine();
        } while(cadena.length()<longitudMinCadena);
        return  cadena;
    }
    public static String coincidenCadenas (String cadena1, String cadena2){
        int s1 = cadena1.lastIndexOf(cadena2);
        if (s1 != -1) {
            return cadena1.replace(cadena1.substring(s1,s1+cadena2.length()),cadena2.toUpperCase());
        }
        return cadena1;
    }


}

