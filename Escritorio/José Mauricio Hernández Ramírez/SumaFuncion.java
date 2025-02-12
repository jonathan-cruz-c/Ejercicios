import java.util.Scanner;
class SumaFuncion{
public static void main (String[] args){
Scanner sc=new Scanner(System.in);
System.out.println ("Dame un numero");
int a=sc.nextInt();
System.out.println ("Dame otro numero");
int b=sc.nextInt();
System.out.println (Suma(a,b));
}
public static int Suma (int a, int b){
return a+b;
}
}

