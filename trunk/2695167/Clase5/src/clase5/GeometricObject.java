/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

/**
 *
 * @author Erick
 */
public class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;
    double numero;
    
    protected GeometricObject() {
    }
    public String getColor (){
        return color;
    }
    public void setColor (String color){ 
    }
    public boolean isFilled (){
        return filled;
    }
    public void setFilled (boolean filled){
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    @Override
    public String toString(){
        return color;
    }
    public double getArea(){
        return numero;
    }
    public double getPerimeter(){
        return numero;
    }           


public class Circle extends GeometricObject {
    private double Radio;
    
    public Circle(){
    }
    public Circle (double r){
    }
    public double getRadius(){
        return numero;
    }
    public void setRadius(double radius){
    }
    public double getDiameter(){
        return numero;
    }
}

public class rectangle extends GeometricObject {
    private double width;
    private double height;
    
    public rectangle(){
    }
    public rectangle(double w, double h){
    }
    public double getWidth(){
        return numero;
    }
    public void setWidth(double width){
        
    }
    public double getHeight(){
        return numero;
    }
    public void setHeight(double height){
        
    }
}
}