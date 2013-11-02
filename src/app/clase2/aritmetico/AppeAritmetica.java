/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.aritmetico;

/**
 *
 * @author alumno
 */
public class AppeAritmetica {
    public static void main(String[] args) {
         OperacionesAritmeticas operacion = new OperacionesAritmeticas();
                 double suma = operacion.sumar(10d, 20d);
                 System.out.println(suma);
 
                 int mayor = operacion.getMax(10, 11);
                 System.out.println(mayor);
                
    
    }
}
