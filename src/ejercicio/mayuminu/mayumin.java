/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.mayuminu;
 import java.util.Scanner;
/**
 *
 * @author Fany
 */
public class mayumin {
     public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
    System.out.println("Escriba una cadena");
   String cad = teclado.nextLine();
 
    System.out.println(cad.toUpperCase());
    
 }

}
