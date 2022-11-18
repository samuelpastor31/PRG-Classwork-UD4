package activitat18;

import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        conteoVocales(pedirPalabraOFrase());
    }
    public static String pedirPalabraOFrase(){
        Scanner teclat = new Scanner(System.in);
        String palabraOFrase;
        System.out.println("Introduzca una palabra o frase:");
        palabraOFrase = teclat.nextLine();
        return palabraOFrase;
    }

    public static void conteoVocales(String frase) {
        int contador = 0;
        for (int i = 0; i <frase.length() ; i++) {
            if ((frase.charAt(i)=='a') || (frase.charAt(i)=='e') || (frase.charAt(i)=='i')
                    || (frase.charAt(i)=='o') || (frase.charAt(i)=='u')){
                contador++;
            }
        }
        System.out.println("La palabra o frase contiene "+contador+" vocales");
    }
}
