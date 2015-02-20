/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;
public class GeObjects {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;
    private double numero;
   
    protected GeObjects(){
        
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        
}
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    public String toString(){
        return color;
    }
    public double getArea(){
        return numero;
    }
    public double getPerimeter(){
        return numero;
    }
    
        public class circle extends GeObjects {
            private double radius;
            
            public circle(){
                
            }
            public circle(double r){
                
            }
            public double getRadius(){
                return radius;
            }
            public void setRadious(double radius){
                
            }
            public double getDiameter(){
                return radius;
            }
}
        public class rectangle extends GeObjects {
             private double width;
             private double height;
             
             public rectangle(){
                 
             }
             public rectangle(double w, double h){
                 
             }
             public double getwidth(){
                 return width;
             }
             public void setWidth(double width){
                 
             }
             public double getHeight(){
                 return height;
             }
             public void setHeight(double height){
                 
             }
         }
}
