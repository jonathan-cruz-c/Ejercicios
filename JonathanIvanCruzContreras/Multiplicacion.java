import java.util.Scanner;

class Multiplicacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int x = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int y = sc.nextInt();
        System.out.println("El resultado es: " + resultadoMultiplicacion(x, y));
    }

    public static int resultadoMultiplicacion(int a, int b) {
        return a * b;
    }
}