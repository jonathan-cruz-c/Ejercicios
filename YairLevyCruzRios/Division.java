import java.util.Scanner;

public class Division {

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        double num1 = scan.nextDouble();
        
        System.out.print("Ingresa el segundo número: ");
        double num2 = scan.nextDouble();
        
        double resultado = dividir(num1, num2);
        System.out.println("La division de " + num1 + " entre " + num2 + " es: " + resultado);
        
        scan.close();
    }
}
