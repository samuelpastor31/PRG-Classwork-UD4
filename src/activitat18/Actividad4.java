package activitat18;

import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        System.out.println(quitarBlanco(pedirFrase()));
    }
    public static String pedirFrase(){
        Scanner teclat = new Scanner(System.in);
        String Frase;
        System.out.println("Introduzca una palabra o frase:");
        Frase = teclat.nextLine();
        return Frase;
    }
    public static String quitarBlanco(String frase){
     return frase.replace(" ","");

    }
}
