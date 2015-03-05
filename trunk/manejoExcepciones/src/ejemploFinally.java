/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgonzalezl
 */
public class ejemploFinally {
    
  public static void main(String[] args) {
 
    try {
      long data[] = new long[1000000000]; 
    }
    catch (Exception e) {
      System.out.println(e);
    }
 
    finally {
      System.out.println("Este bloque siempre se ejecuta");
    }
  }
}   
    
    
    
    
    
    
    
    
    
}
