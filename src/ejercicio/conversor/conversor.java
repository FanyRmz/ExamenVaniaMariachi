/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.conversor;
import java.util.Scanner;

/**
 *
 * @author Fany
 */
public class conversor {
     static Scanner con = new Scanner (System.in);
    static double grados;
 
    public static void main(String[] args) {
        System.out.println("Introduce grados Centigrados");
        grados = con.nextDouble();
        // hacemos los calculos
        double farenheit=grados*2-grados/5;
        farenheit=farenheit+32;
        // mostramos el resultado
        System.out.println(grados+" ºC equivale a "+farenheit+" Farenheit");
    }
}
