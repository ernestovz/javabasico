/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.formato;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Formato {

    public static void main(String args[]) {
       // Formato.calendario();
        // Formato.moneda();
        // Formato.dateFormat();
        Formato.simpleDateFormat();
    //    Formato.compararFechas();
    }

    public static void calendario() {
//        GregorianCalendar ahora = new GregorianCalendar();

        Calendar ahora = new GregorianCalendar(1990, 06, 01);
        System.out.println("Fecha : " + ahora.getTime());
        System.out.println("Año: " + ahora.get(Calendar.YEAR));
        System.out.println("Mes: " + ahora.get(Calendar.MONTH));
        System.out.println("Día del mes: " + ahora.get(Calendar.DAY_OF_MONTH));
//
        System.out.println("Hora: " + ahora.get(Calendar.HOUR));
        System.out.println("Minuto: " + ahora.get(Calendar.MINUTE));
        System.out.println("Segundo: " + ahora.get(Calendar.SECOND));
        System.out.println("Milisegundo: " + ahora.get(Calendar.MILLISECOND));
//
        System.out.println("Primer día de la semana : " + ahora.getFirstDayOfWeek());
        System.out.println("Semana del mes: " + ahora.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Semana del año: " + ahora.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Día del año: " + ahora.get(Calendar.DAY_OF_YEAR));
    }

    public static void moneda() {
// Formato de moneda
        NumberFormat nfe = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        nfe.setGroupingUsed(false);
        NumberFormat nfd = NumberFormat.getCurrencyInstance(Locale.US);
        nfd.setGroupingUsed(false);
        Locale lp = new Locale("es", "PE");
        NumberFormat nfp = NumberFormat.getCurrencyInstance(lp);
        nfp.setGroupingUsed(false);
        System.out.println("Moneda Euro :" + nfe.format(150));
        System.out.println("Moneda Dolar :" + nfd.format(150));
        System.out.println("Moneda Soles :" + nfp.format(150));
    }

    public static void dateFormat() {
        Date now = new Date();
        System.out.println(now.getTime());
        DateFormat df = DateFormat.getDateInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);


        //DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);

        System.out.println(df1.format(now));
        System.out.println(df2.format(now));
        System.out.println(df3.format(now));
        System.out.println(df4.format(now));
        System.out.println(df5.format(now));

    }

    public static void simpleDateFormat() {
        DateFormat df = new SimpleDateFormat("Z d MMMM");
        DateFormat f = new SimpleDateFormat("yyMMddHHmmssZ");
        DateFormat xf = new SimpleDateFormat("hh 'o''clock' a, zzzz");
        DateFormat yf = new SimpleDateFormat("yyMMddHHmmssZ");
        Date now = new Date();

        System.out.println(df.format(now));
        System.out.println(f.format(now));
        System.out.println(xf.format(now));
        System.out.println(yf.format(now));
    
    }

    public static void compararFechas() {

        Calendar c1 = new GregorianCalendar(2011, 9, 10);
        Date fecha1 = c1.getTime();
        Calendar c2 = new GregorianCalendar(2011, 9, 3);
        Date fecha2 = c2.getTime();
        if (fecha1.after(fecha2)) {
            System.out.println("fecha1 es después que fecha2");
        }
        if (fecha1.before(fecha2)) {
            System.out.println("fecha1 es antes que fecha2");
        }

    }
}