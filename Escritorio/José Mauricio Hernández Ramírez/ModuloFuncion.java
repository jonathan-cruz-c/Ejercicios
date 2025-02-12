import java.util.Scanner;
class ModuloFuncion{
public static void main (String[] args){
Scanner sc=new Scanner(System.in);
System.out.println ("Dame un numero");
int a=sc.nextInt();
System.out.println ("Dame otro numero");
int b=sc.nextInt();
System.out.println (Modula(a,b));
}
public static int Modula (int a, int b){
return a%b;
}
}


