/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.objeto;

/**
 *
 * @author alumno
 */
public class TestObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Socio jose = new Socio(302, "David", "Tecsup");
        Socio luis = new Socio(302, "David", "Tecsup");
        if (jose == luis) {
            System.out.println("Comprobando referencia");
        }
        if (jose.equals(luis)) {
            System.out.println("Comprobando el valor");
            System.out.println(jose.toString());
        }

    }
}
