package src;

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
public class division {

    public static void main(String[] args) {
 
  int a, b, resultado;
 
  Scanner datos = new Scanner(System.in);
  System.out.println("Introduce 2 valores enteros");
 
  a = datos.nextInt();
  b = datos.nextInt();
 
  resultado = a / b;
 
  System.out.println("Resultado = " + resultado);
  }
}
    
    
    

