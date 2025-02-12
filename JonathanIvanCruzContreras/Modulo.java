import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para el modulo: ");
        double x = sc.nextInt();
        double r = resultadoMOdulo(x);
        System.out.println("El resultado es: " + r);
    }

    public static double resultadoMOdulo(double a) {
        return a % 3;
    }
}