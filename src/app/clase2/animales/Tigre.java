/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.animales;

/**
 *
 * @author alumno
 */
public class Tigre extends Animal {

    public Tigre(String nombre, int edad) {

        this.setNombre(nombre);
        this.setEdad(edad);
    }

    @Override
    public void hacerRuido() { /* por override*/
        System.out.println("sdhsadhashdashdhas");
    }

    public void hacerRuido(Boolean molestar) { /* por sobrecarga*/
        System.out.println("ppppppppppppppp");
    }

}
