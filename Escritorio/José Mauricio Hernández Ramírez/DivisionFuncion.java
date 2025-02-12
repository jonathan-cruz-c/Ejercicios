import java.util.Scanner;
class DivisionFuncion{
public static void main (String[] args){
Scanner sc=new Scanner(System.in);
System.out.println ("Dame un numero");
int a=sc.nextInt();
System.out.println ("Dame otro numero");
int b=sc.nextInt();
System.out.println (Dividir(a,b));
}
public static int Dividir (int a, int b){
return a/b;
}
}

