/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.objeto;

/**
 *
 * @author alumno
 */
public class Socio {

    /**
     * @param args the command line arguments
     */
    private int codigo;
    private String nombre;
    private String direccion;
// Generar SET y GET

    public Socio(int codigo, String nombre, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        String cadena = "Codigo : " + this.codigo;
        cadena += "nombre: " + this.nombre;
        cadena += "direccion: " + this.direccion;
        return cadena;
    }

    @Override
    public boolean equals(Object o) {
        Socio s = (Socio) o;
        if (this.codigo == s.codigo
                && this.nombre.equals(s.nombre)
                && this.direccion.equals(s.direccion)) {
            return true;
        } else {
            return false;
        }
    }
}
