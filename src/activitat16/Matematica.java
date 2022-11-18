package activitat16;

public class Matematica {

    public static void imprimirSuma(int num1, int num2) {
        System.out.print(num1 + " + " + num2 + " = ");
        System.out.println(obtindreSuma(num1, num2));

    }

    public static int obtindreSuma(int num1, int num2) {

        return num1 + num2;
    }

    public static int obtindreResta(int num1, int num2) {
        return num1 - num2;
    }

    public static void imprimirResta(int num1, int num2) {
        System.out.print(num1 + " - " + num2 + " = ");
        System.out.println(obtindreResta(num1, num2));
    }

    public static int obtindreMultiplicacio(int num1, int num2) {
        return num1 * num2;
    }

    public static void imprimirMultiplicacio(int num1, int num2) {
        System.out.print(num1 + " * " + num2 + " = ");
        System.out.println(obtindreMultiplicacio(num1, num2));
    }

    public static double obtindreDivisio(int num1, int num2) {
        return (double) num1 / (double) num2;
    }

    public static void imprimirDivisio(int num1, int num2) {
        System.out.printf("%d / %d = %.3f", num1, num2, obtindreDivisio(num1, num2));
        System.out.println();

    }

    public static int obtindreModul(int num1, int num2) {
        int resto = num1 % num2;

        return resto;
    }

    public static void imprimirModul(int num1, int num2) {
        System.out.print(num1 + " % " + num2 + " = ");
        System.out.println(obtindreModul(num1, num2));
    }

    public static double obtindreArrelQuadrada(double num1) {

        double arrelQuadra;
        arrelQuadra = Math.sqrt(num1);

        return arrelQuadra;
    }

    public static void imprimirArrelQuadrada(double num1) {
        System.out.printf("√ %.2f = %.2f", num1, obtindreArrelQuadrada(num1));
        System.out.println();
    }

    public static int obtindrePotencia(int base, int exponent) {
        return (int) Math.pow(base, exponent);

    }

    public static void imprimirPotencia(int num1, int num2) {
        System.out.print(num1 + "^" + num2 + " = ");
        System.out.println(obtindrePotencia(num1, num2));
    }

    public static int obtindreAreaRectangle(double base, double altura) {
        return (int) (obtindreMultiplicacio((int)base,(int)altura));
    }

    public static void imprimirAreaRectangle(double base, double altura) {
        System.out.print(base + " x " + altura + " = ");
        System.out.println(obtindreAreaRectangle(base, altura));
    }

    public static int obtindreVolumPrisma(double ample, double alt, double profunditat) {
        return (int) obtindreMultiplicacio(obtindreMultiplicacio((int)ample,(int)profunditat),(int)alt);
    }

    public static void imprimirVolumPrisma(double ample, double alt, double profunditat) {
        System.out.print(ample + " x " + profunditat + " x " + alt + " = ");
        System.out.println(obtindreVolumPrisma(ample, alt, profunditat));
    }


    /**
     * Si el paràmetre @solucio1 és true, s’obtindrà la sol.lució
     * (-b+√b^2-4ac)/2a  si no, s’obtindrà la sol.lució (-b-√b^2-4ac)/2a
     * Si necessites obtindre els 2 resultats hauràs de cridar-lo 2 vegades
     */

    public static double obtindreEquacioGrau2(int a, int b, int c, boolean solucio1) {
        if (solucio1 == true) {
          return (-b+Math.sqrt(b*b-4*a*c))/(2*a);
        } else {
           return (-b-Math.sqrt(b*b-4*a*c))/(2*a);
        }
    }

    public static void imprimirEquacioGrau2 (int a, int b, int c, boolean solucio1)  {
        System.out.printf("%.3f ",obtindreEquacioGrau2(a,b,c,solucio1));



    }
}

