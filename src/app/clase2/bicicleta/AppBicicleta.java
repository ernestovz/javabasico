/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.bicicleta;

/**
 * para cambiar el nombre a todas las variables CONTROL + R
 * @author alumno
 */
public class AppBicicleta {

    public static void main(String[] args) {
        Bicicleta nike = new Bicicleta();
        /* control + space para completa clase */
        nike.setMarca("monark");
        nike.setModelo("123");
        nike.cambiarLlantas();
        System.out.println(nike.getMarca());
        System.out.println(nike.getModelo());
        
     }
    
    
    
}
