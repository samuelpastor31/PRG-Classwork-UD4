package Projecte1;

import java.util.Scanner;

public class Projecte {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";


    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        sacarInicio();
        System.out.println(preguntaInicio());
    }

    public static void sacarInicio() {
        System.out.println("BIENVENIDOS A LA AVENTURA DEL SEÑOR DEL ANILLOS\n" +
                "================================================\n" +
                "\n" +
                "Era un día tranquilo en Hobbiton. Todos los hobbits preparaban la fiesta aniversario de la destrucción del anillo que liberó a toda la Tierra Media del reinado negro de Sauron.\n" +
                "Nuestro héroe Frodo, junto a sus amigos, se encargaban de decorar la cueva del ya anciano Bilbo Bolsón. \n" +
                "De repente, una silueta conocida se dejó ver por la ventana…. \n" +
                "¡Oh no! ¡Gandalf! Siempre que aparece ese viejo mago, nunca trae buenas noticias….\n" +
                "Éste pidió reunirse urgentemente con Frodo y sus compañeros Sam, Merry y Pippin. Tras su charla, los hobbits confirmaron los peores augurios… Les contó que el anillo no había sido destruido, que no sabe cómo, pero Gollum lo poseía de nuevo en su cueva y lo guardaba para que nadie se lo quitase. \n" +
                "\n" +
                ANSI_RED + "Gandalf:" + ANSI_RESET + " Por favor hobbits, debéis encargaros de encontrarlo y destruirlo de nuevo en el Monte del Destino de Mordor pero esta vez no podéis fallar.\n");
    }

    public static boolean preguntaInicio() {
        boolean siguienteNivel = true;
        Scanner teclat = new Scanner(System.in);
        System.out.println("¿Quieres que Frodo y sus compañeros acepten el reto de Gandalf y vayan a buscar el anillo para destruirlo? (SÍ / NO)\n");
        switch (teclat.nextLine()) {
            case "SI" -> siguienteNivel = true;
            case "NO" -> siguienteNivel = false;
        }
        return siguienteNivel;
    }

    public static void fi(boolean )

}
