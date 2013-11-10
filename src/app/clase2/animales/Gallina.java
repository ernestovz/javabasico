/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.animales;

/**
 *
 * @author alumno
 */
public class Gallina extends Animale {
    
    public Gallina(String nombre, int edad)     {
        
        this.setNombre(nombre);
        this.setEdad(edad);
        
    }

    @Override
    public void comer() {
        System.out.println("gallina come");     
    }

    @Override
    public void hacerRuido() {
        System.out.println("kirkirkririkrirk");
    }
            
    
    
}
