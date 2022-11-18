package actividad15;

public class SumatorioNumeros {
    public static void main(String[] args) {
        System.out.println(sumaNumeros(12021));
    }

    public static long sumaNumeros(long num) {
        long suma = 0;
        do {

            long resto = num % 10;
            num = num / 10;
            suma = suma + resto;

        } while (num != 0);

        return suma;
    }
}
