/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.cadenas;

/**
 *
 * @author alumno
 */
public class Cadena {

    public static void main(String[] args) {
        Cadena.StringBuffer();
        Cadena.buffer1();
        
    }
            
    public static void StringBuffer () {
        
        StringBuffer sb = new StringBuffer("Java Basico Tecsup Lima");
        sb.insert(11, " en");
        sb.delete(21, sb.length());
        System.out.println(sb);
        
    }
    
    public static void buffer1() {
        StringBuffer buffer = new StringBuffer("Tecsup");
        buffer.append(" - ");
        buffer.append("Java");
        buffer.insert(0, "Instituto");
        
        buffer.delete(buffer.indexOf("Java"),buffer.length()); /* donde empieza java y despues cuantos */
        System.out.println(buffer);
        System.out.println(buffer.reverse()); /* invierte la cadena */
        
    }
        
}