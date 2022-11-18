package activitat18;

import java.util.Scanner;

public class Actividad1 {
    private static int INTENTOS = 3;

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        adivinarPalabra(pedirPalabra());

    }

    public static String pedirPalabra() {
        Scanner teclat = new Scanner(System.in);
    System.out.println("Introduzca palabra secreta");
    String palabraSecreta = teclat.nextLine();
    return palabraSecreta;
    }

    public static void adivinarPalabra(String palabra) {
        Scanner teclat = new Scanner(System.in);
        int contador = 1;
        for (int i = 0; i <INTENTOS ; i++) {
            System.out.println("Intenta averiguar la palabra, intento "+contador+":");
            String intentoPalabra =teclat.nextLine();
            if (intentoPalabra.equalsIgnoreCase(palabra)) {
                System.out.println("Enhorabuena!!");
                i = INTENTOS;
            }else {
                contador++;
            }
        }
    }
}
