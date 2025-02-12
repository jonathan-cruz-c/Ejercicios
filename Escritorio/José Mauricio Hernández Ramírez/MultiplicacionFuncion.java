import java.util.Scanner;
class MultiplicacionFuncion{
public static void main (String[] args){
Scanner sc=new Scanner(System.in);
System.out.println ("Dame un numero");
int a=sc.nextInt();
System.out.println ("Dame otro numero");
int b=sc.nextInt();
System.out.println (Multiplicar(a,b));
}
public static int Multiplicar (int a, int b){
return a*b;
}
}




