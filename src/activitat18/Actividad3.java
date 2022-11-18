package activitat18;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println(cadenaInvertida("Que pasa maquina"));


    }
    public static String cadenaInvertida(String cadena) {
        String cadenaInvertida = "";
        for (int i =cadena.length()-2;i>=0 ; i--) {
            cadenaInvertida += cadena.charAt(i);
        }
        return cadena.concat(cadenaInvertida);
    }
}
