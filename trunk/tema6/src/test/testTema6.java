/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import figurasGeometricas.circulo;
import figurasGeometricas.triangulo;
import figurasGeometricas.rectangulo;
import figurasGeometricas.cuadrado;
import java.util.Scanner;
/**
 *
 * @author jgonzalezl
 */
public class testTema6 {
    
     public static void main(String args[]) {
  
     rectangulo r1= new rectangulo(5,4);
     System.out.println(r1.tipo);
     System.out.println(r1.calcularArea());
     System.out.println(r1.calcularPerimetro());
     System.out.println(r1.id);
     System.out.println(r1.verDetalles());
     
     rectangulo r2= new rectangulo(5,4);
     System.out.println(r1.tipo);
     System.out.println(r1.calcularArea());
     System.out.println(r1.calcularPerimetro());
     System.out.println(r1.id);
     
     
     
     }
}
