/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.universo.interfases;

/**
 *
 * @author alumno
 */
public class TerricolaGuerrero extends Terricola implements GuerreroHumano{

    @Override
    public void doHeroe() {
        System.out.println("heroe");
    }

    @Override
    public void doluchar() {
        System.out.println("luchador");
    }

    @Override
    public void doRugirGuerra() {
        System.out.println("ruge");
    }
 
    
    
}
