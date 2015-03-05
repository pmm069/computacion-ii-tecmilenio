/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.Scanner;
/**
 *
 * @author jgonzalezl
 */
public class divisionCero {
  public static void main(String[] args) {
 
  int a, b, resultado;
 
  Scanner datos = new Scanner(System.in);
  System.out.println("Introduce 2 enteros");
 
  a = datos.nextInt();
  b = datos.nextInt();
 
  // bloque try 
 
  try {
    resultado  = a / b;
    System.out.println("Resultado = " + resultado);
  }
 
  // bloque catch 
 
  catch (ArithmeticException e) {
    System.out.println("No se puede dividir entre 0");
  }
  }

}
