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
abstract public class figuraGeometrica {
    public static int id;
    public double perimetro;
    public double area;
    public boolean relleno=false;
    public String colorBorde;
    public String colorRelleno;
    public String tipo;
    abstract public double calcularArea();
    abstract public double calcularPerimetro();
  
    public String verDetalles(){
        return  "Id: "+id+",Tipo: "+tipo;
    } 
}


