/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.animales;

/**
 *
 * @author alumno
 */
public class Zoologico {
    public static void main(String[] args) {
        
        Tigre diego = new Tigre("Diego", 20); /* estoy instanciando*/
        diego.hacerRuido();
        diego.hacerRuido(true);
        
        
        Gallina pepe = new Gallina("PEPE", 10);
        pepe.hacerRuido();
        pepe.comer();
    }
    
}
