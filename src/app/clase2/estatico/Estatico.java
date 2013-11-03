/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.estatico;

/**
 *
 * @author alumno
 */
public class Estatico {
    
 static int contador;
 
 public Estatico(){
contador++;
}

public static double dolaraEuro(double a) {
double euro = a * 0.81559;
return euro;
}




}
