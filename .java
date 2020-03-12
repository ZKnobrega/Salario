import java.util.Scanner;
public class Salario {

  public static void main(String[] args)
  {
  Scanner valor = new Scanner (System.in);
    double sal, salA;
    sal = valor.nextDouble();
    salA = valor.nextDouble();
    System.out.printf ("Você recebe : ");
    System.out.print (sal/salA);
    System.out.print (" Salários");
  }
}
