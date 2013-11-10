/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.interfases.posicion;

/**
 *
 * @author alumno
 */
public class Teodolito {
    
    public void getDistancia(Position p1, Position p2)    {
        
        double resultado = p2.getLongitud() - p1.getLongitud();
        System.out.println(resultado);
        
    }
}
