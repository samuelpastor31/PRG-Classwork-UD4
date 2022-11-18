package activitat16;

public class Activitat16 {

    public static void main(String[] args) {
        System.out.println("SUMA");
        System.out.println("____");
        Matematica.imprimirSuma(2,4);
        Matematica.imprimirSuma(6,8);
        Matematica.imprimirSuma(3,2);

        System.out.println("\nRESTA");
        System.out.println("____");
        Matematica.imprimirResta(2,4);
        Matematica.imprimirResta(6,8);
        Matematica.imprimirResta(3,2);

        System.out.println("\nMULTIPLICACIÓ");
        System.out.println("-------------");
        Matematica.imprimirMultiplicacio(2,4);
        Matematica.imprimirMultiplicacio(6,8);
        Matematica.imprimirMultiplicacio(3,2);

        System.out.println("\nDIVISIÓ");
        System.out.println("-------");
        Matematica.imprimirDivisio(2,4);
        Matematica.imprimirDivisio(6,8);
        Matematica.imprimirDivisio(3,2);

        System.out.println("\nMÒDUL");
        System.out.println("-----");
        Matematica.imprimirModul(2,4);
        Matematica.imprimirModul(6,8);
        Matematica.imprimirModul(3,2);

        System.out.println("\nARREL QUADRADA");
        System.out.println("---------------");
        Matematica.imprimirArrelQuadrada(16);
        Matematica.imprimirArrelQuadrada(4);
        Matematica.imprimirArrelQuadrada(2);

        System.out.println("\nPOTÈNCIA");
        System.out.println("--------");
        Matematica.imprimirPotencia(2,4);
        Matematica.imprimirPotencia(6,8);
        Matematica.imprimirPotencia(3,2);


        System.out.println("\nÀREA RECTANGLE");
        System.out.println("--------------");
        Matematica.imprimirAreaRectangle(12,34);
        Matematica.imprimirAreaRectangle(19.4,42.4);
        Matematica.imprimirAreaRectangle(27,56.4);

        System.out.println("\nVOLUM PRISMA");
        System.out.println("------------");
        Matematica.imprimirVolumPrisma(12,34, 10);
        Matematica.imprimirVolumPrisma(19.4,42.4, 200);
        Matematica.imprimirVolumPrisma(27,56.4,50);

        System.out.println("\nEQUACIÓ DE SEGON GRAU ");
        System.out.println("---------------------");
        System.out.print("+12x^2 +34x +7 = 0 x1 = ");
        Matematica.imprimirEquacioGrau2(12,34,7,true);
        System.out.print(" x2 = ");
        Matematica.imprimirEquacioGrau2(12,34,7,false);

        System.out.println("\n\nEQUACIÓ DE SEGON GRAU ");
        System.out.println("---------------------");
        System.out.print("+19x^2 -42x +23 = 0 x1 = ");
        Matematica.imprimirEquacioGrau2(19,-42,23,true);
        System.out.print(" x2 = ");
        Matematica.imprimirEquacioGrau2(19,-42,23,false);


        System.out.println("\n\nEQUACIÓ DE SEGON GRAU ");
        System.out.println("---------------------");
        System.out.print("+27x^2 +56x -16 = 0 x1 = ");
        Matematica.imprimirEquacioGrau2(27,56,-16,true);
        System.out.print(" x2 = ");
        Matematica.imprimirEquacioGrau2(27,56,-16,false);


    }
}
