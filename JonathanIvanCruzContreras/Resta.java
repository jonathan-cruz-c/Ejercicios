import java.util.Scanner;

class Resta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero que se va a restar: ");
        int x = sc.nextInt();
        System.out.println("Ingrese el numero que va a restar: ");
        int y = sc.nextInt();
        System.out.println("El resultado es: " + resultadoResta(x, y));
    }

    public static int resultadoResta(int a, int b) {
        return a - b;
    }
}