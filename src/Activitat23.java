import java.util.Locale;
import java.util.Scanner;

public class Activitat23 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);


        String nom = "";
        String primerCognom;
        String segonCognom;


        System.out.println("Introduce tu nombre");
        nom = teclat.nextLine();
        System.out.println("Introduce tu 1 apellido");
        primerCognom = teclat.nextLine();
        System.out.println("Introduce tu 2 apellido");
        segonCognom = teclat.nextLine();
        String nomComplet = crearNomComplet(nom,primerCognom,segonCognom);

        imprimirNomLongitud(nomComplet);
        ocurrencies(nomComplet);
        primersCaracters(nomComplet);
        System.out.println(cadenaInvertida(nomComplet));






    }public static String crearNomComplet (String nom,String primerCognom, String segonCognom) {
        return  nom.concat(" "+primerCognom+" "+segonCognom);
    }


    public static void imprimirNomLongitud (String nomComplet) {
        System.out.println("Minúsculas");
        System.out.println(nomComplet.toLowerCase());
        System.out.println(nomComplet.toUpperCase());
        System.out.println("LONGITUD");
        System.out.println(nomComplet.length());
    }

    public static void ocurrencies(String nomComplet) {
       int longitudNombre = nomComplet.length();
       char ultimoCaracter = nomComplet.charAt(longitudNombre-1);
       int ocurrencies = 0;
        for (int i = 0; i <longitudNombre ; i++) {
            if (nomComplet.charAt(i)==ultimoCaracter) {
                ocurrencies ++;
            }
        }
        System.out.println("El ultimo caracter "+ultimoCaracter+ " ocurrencies "+ocurrencies);
    }

    public static void primersCaracters(String nomComplet) {
        int numCaracteres = 2;
        if (nomComplet.length() <= numCaracteres) {
            System.out.println("2 primeros caracteres: " + nomComplet.substring(0, numCaracteres));
        }
    }

    public static String cadenaInvertida(String nomComplet) {
        String cadenaInvertida = "";
        for (int i =nomComplet.length()-1;i>0 ; i--) {
            cadenaInvertida += nomComplet.charAt(i);
        }
     return cadenaInvertida;
    }
}
