/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.interfases.posicion;

public class Auto implements Position {
    private int numeroPuertas;
    private String color;
    
    private double longitud;
    private double latitud;
    
public Auto(){
    this.longitud = 20;
    this.latitud = 10;
}
    
    
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getLongitud() {
       return this.longitud;
    }

    @Override
    public double getLatitud() {
        return this.latitud;
    }
    
    
    
}
