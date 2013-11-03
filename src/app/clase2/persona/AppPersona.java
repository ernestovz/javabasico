/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.persona;

/**
 *
 * @author alumno COPIAR LINEA SHIFT +CONTROL + FLECHA ABAJO O ARRIBA MOVER
 * LINEA SHIFT +ALT + FLECHA ABAJO O ARRIBA BORRAR LINEA SHIFT +SUPR + FLECHA
 * ABAJO O ARRIBA
 */
public class AppPersona {

    public static void main(String[] args) {

        Persona ernesto = new Persona("Jose", "EA", 25);
        

        System.out.println("Atributos del Objeto");
        System.out.println("Nombre:  " + ernesto.getNombre());
        System.out.println("Apellido:  " + ernesto.getApellidos());
        System.out.println("Edad:  " + ernesto.getEdad());
        
        
        Persona jose = new Persona();
        jose.setNombreApellido("enesto", "vigil");
        jose.printNombreCompleto();
        

    }
}
