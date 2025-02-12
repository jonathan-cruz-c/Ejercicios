import java.util.Scanner;

public class Modulo {

    public static int modulo(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        int num1 = scan.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        int num2 = scan.nextInt();
        
        int resultado = modulo(num1, num2);
        System.out.println("El residuo de dividir " + num1 + " entre " + num2 + " es: " + resultado);
        
        scan.close();
    }
}
