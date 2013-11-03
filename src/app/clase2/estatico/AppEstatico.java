/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.estatico;

/**
 *
 * @author alumno
 */
public class AppEstatico {

    public static void main(String[] args) {
        AppEstatico.metodoEstatico();
        AppEstatico.atributoEstatico();

    }

    public static void metodoEstatico() {

        double euro = Estatico.dolaraEuro(10d);
        System.out.println(euro);

    }

    public static void atributoEstatico() {

        Estatico estaUn = new Estatico();
        Estatico estaDo = new Estatico();
        Estatico estaTres = new Estatico();
        System.out.println(Estatico.contador);
        System.out.println(Estatico.contador); /* esto es para no instanciar */


    }
}
