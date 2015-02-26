package figurasGeometricas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgonzalezl
 */
public class circulo extends figuraGeometrica implements metodosFigurasGeometricas{
        public double radio;
    
        public void circulo(double radio){
             this.tipo="circulo";
             this.radio=radio;
    }
        
        public double calcularPerimetro(){
              perimetro = pi*(radio+radio);  
              return perimetro;
        }
        
        public double calcularArea(){
                area=pi*(radio*radio);
                return area;
        }
        
 
    


}
