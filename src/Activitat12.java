public class Activitat12 {
    public static void main(String[] args) {
        imprimeixPiramidal('e',6);
    }
    public static void imprimeixPiramidal(char caràcter,int numLineas) {
        for (int fila = 1; fila <numLineas ; fila++) {
            for (int blancos = 1; blancos <numLineas-fila ; blancos++) {
                System.out.print(" ");
            }
            for (int i = 0; i <i*2-1 ; i++) {
                System.out.println(caràcter);
            }
            System.out.print(" ");
        }
        }
    }

