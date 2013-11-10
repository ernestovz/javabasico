/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.objeto;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date fecha1 = new Date(); /*  */
        Date fecha2 = fecha1;
        if(fecha1==fecha2){
            System.out.println("iguales ");
        }
        if(fecha1.equals(fecha2)){
            System.out.println("las fechas son iguales");
        }
    }
}
