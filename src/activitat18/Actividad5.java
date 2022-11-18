package activitat18;

import java.util.Scanner;

public class Actividad5 {
    static final Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        String frase = teclado.nextLine();

        String primeraPalabra = frase.substring(0, frase.indexOf(' '));
        String ultimaPalabra = frase.substring(frase.lastIndexOf(" ")+1);

        String fraseSinPrimeraPalabra = frase.substring(frase.indexOf(' ')+1);
        String fraseSinAmbasPalabras = fraseSinPrimeraPalabra.substring(0, fraseSinPrimeraPalabra.lastIndexOf(" "));

        System.out.print(ultimaPalabra + ' ' + fraseSinAmbasPalabras + ' ' + primeraPalabra);

    }
}
