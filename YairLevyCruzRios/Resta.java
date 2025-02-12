import java.util.Scanner;

public class Resta {

    public static int restar(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        int num1 = scan.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        int num2 = scan.nextInt();
        
        int resultado = restar(num1, num2);
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resultado);
        
        scan.close();
    }
}
