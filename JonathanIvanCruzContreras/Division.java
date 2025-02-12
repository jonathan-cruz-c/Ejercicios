import java.util.Scanner;

class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero que se divide: ");
        int x = sc.nextInt();
        System.out.println("Ingrese el numero divisor: ");
        int y = sc.nextInt();
        double r = resultadoDivision(x, y);
        System.out.println("El resultado es: " + r);
    }

    public static int resultadoDivision(int a, int b) {
        return a / b;
    }
}