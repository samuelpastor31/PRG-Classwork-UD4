package actividad15;

public class ConversorDeMonedas {
    public static void main(String[] args) {
        System.out.println(cambioMoneda(3,3));

    }
    public static double cambioMoneda(double euros,int moneda) {
        double aux = 0;
        switch (moneda) {
            case 1 : aux= moneda * 1.28611 / 1;
            break;
            case 2 : aux= moneda * 129.852 / 1;
            break;
            case 3 : aux= moneda * 0.86 / 1;
            break;
        }
        return aux;
    }
}
