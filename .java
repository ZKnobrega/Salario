package com.hello;

import java.util.Scanner;
public class Hello {

  public static void main(String[] args)
  {
  Scanner valor = new Scanner (System.in);
    Double sal, salA;
    System.out.print("Insira seu saláro Mensal: ");
    sal = valor.nextDouble();
    System.out.print("Insira valor do salario minimo: ");
    salA = valor.nextDouble();
    System.out.printf ("Você recebe: %.2f", sal/salA);
    System.out.print (" salarios minimos");

  }
}
