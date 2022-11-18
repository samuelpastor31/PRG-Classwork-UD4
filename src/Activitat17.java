import java.util.Scanner;

public class Activitat17 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        textoEntero();

        int numero = 0;
        int aux = 0;
        int numeroAConvertir = 0;
        do{
            System.out.println("Selecciona una opción [1-3]:");
           if(teclat.hasNextInt()) {
               numero = teclat.nextInt();
           }else {
               System.out.println("¡Error! Tipo de dato no esperado.");
               break;
           }
            switch(numero) {
                case 1:
                    System.out.println("¿Qué número quieres convertir?:");
                    if(teclat.hasNextInt()) {
                        numeroAConvertir = teclat.nextInt();
                    }else {
                        System.out.println("¡Error! Tipo de dato no esperado.");}
                    System.out.println("El número "+numeroAConvertir+" en decimal es "+obtindreEnBaseOctal(numeroAConvertir));
                    break;

                case 2:
                    System.out.println("¿Qué número quieres convertir?:");
                    if(teclat.hasNextInt()) {
                        numeroAConvertir = teclat.nextInt();
                    }else {
                        System.out.println("¡Error! Tipo de dato no esperado.");}
                    System.out.println("El número "+numeroAConvertir+" en decimal es "+obtindreEnBaseDecimal(numeroAConvertir));
                    break;

                case 3:
                    System.out.println("Adiós");
                    aux++;
                    break;

                default:
                    System.out.println("¡Error! La opción no es correcta\n");
            }
        }while(aux == 0);




    }
    public static void textoEntero () {
        System.out.println("Bienvenido al conversor octal-decimal\n" +
                "-------------------------------------\n" +
                "1.- Octal a decimal\n" +
                "2.- Decimal a octal\n" +
                "3.- Salir\n");
    }

    public static long obtindreEnBaseOctal(long decimal){
        int octal = 0;
        int i = 0;
        do{
            if(decimal == 0){
                break;
            } else {
                long resto = decimal%10;
                octal += resto*Math.pow(8, i);
                decimal = decimal/10;
                i++;
            }
        }while(true);
        return octal;
    }

    public static long obtindreEnBaseDecimal(long octal){
        long decimal = 0;
        int multiplicador = 10;
        int i = 0;
        do {
            if(octal==0) {
                break;
            }else {
                long resto = octal % 8;
                octal = octal / 8;
                decimal = decimal + resto * ((int)Math.pow(multiplicador, i));
            }
            i++;
        }while (true);
        return decimal;
    }



  }





