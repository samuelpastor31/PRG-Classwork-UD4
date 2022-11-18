package activitat18;

import java.util.Scanner;

public class Actividad6 {

    static final Scanner teclat = new Scanner(System.in);

    public static void main(String[] args) {
        String dni = obtenerDNI();
        System.out.println("Su NIF es: " + dni + "-" + obtenerNIF(Integer.parseInt(dni)));
    }
    public static String obtenerDNI(){
        System.out.print("Introduzca su DNI: ");
        return teclat.next(); }

    public static char obtenerNIF(int dni){
        String letrasDNI="TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni%23;
        return (letrasDNI.charAt(resto));
    }
}

