/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgonzalezl
 */
public class outOfBOundsHandled {
 
  public static void main(String[] args) {
 
  String languages[] = { "C", "C++", "Java", "Perl", "Python" };
 
  try {
    for (int c = 1; c <= 5; c++) {
      System.out.println(languages[c]);
    }
  }
  catch (Exception e) {
    System.out.println(e);
  }
  }

}
