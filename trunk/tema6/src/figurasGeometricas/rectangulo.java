/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasGeometricas;

/**
 *
 * @author jgonzalezl
 */
public class rectangulo extends figuraGeometrica implements metodosFigurasGeometricas {
    private double largo;
    private double ancho;
    
    /**
     *
     * @param largo
     * @param ancho
     */
    public  rectangulo(double largo, double ancho){
            this.tipo="rectangulo";
             this.largo=largo;
             this.ancho=ancho;
             this.id=id;
             id++;
        }
        
        public double calcularPerimetro(){
              perimetro = (largo*2)+(ancho*2);  
              return perimetro;
        }
        
        public double calcularArea(){
                area=(largo*ancho);
                return area;
        }
        
        public void asignarColorBorde(String color){
                this.colorBorde=color;
        
        }
        
        
        public void asignarColorRelleno(String color){
                this.colorRelleno=color;
                this.relleno=true;
        }

    
    
    
}
