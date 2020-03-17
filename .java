package com.hello;

import java.util.Scanner;
public class Hello {

  public static void main(String[] args)
  {
  Scanner valor = new Scanner (System.in);
    double sal, salA;
    System.out.print("Insira seu saláro Mensal: ");
    sal = valor.nextDouble();
    System.out.print("Insira valor do salario minimo: ");
    salA = valor.nextDouble();
    System.out.print ("Você recebe : ");
    System.out.print (sal/salA);
    System.out.print (" Salários minimos");
  }
}
