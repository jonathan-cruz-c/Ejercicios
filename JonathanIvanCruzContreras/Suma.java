import java.util.Scanner;

class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el primer numero: ");
        int x = sc.nextInt();
        System.out.println("Dame el segundo numero: ");
        int y = sc.nextInt();
        System.out.println("El resultado es: " + resultadoSuma(x, y));
    }

    public static int resultadoSuma(int a, int b) {
        return a + b;
    }
}