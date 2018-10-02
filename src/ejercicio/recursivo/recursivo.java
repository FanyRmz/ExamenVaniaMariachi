/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.recursivo;
import java.util.*;
import java.io.*;
//import java.util.Scanner;

/**
 *
 * @author Fany
 */
public class recursivo {
   
    public static void main(String[] args) throws IOException{
        Scanner num  = new Scanner(System.in);
        int numero, cifras;
        char caracter;
         
            System.out.print("Introduce un número: ");
            numero = num.nextInt();
            cifras= 0;     
            while(numero!=0){             
                    numero = numero/10;         
                   cifras++;          
            }
            System.out.println("El número tiene " + cifras+ " cifras");
            
            
    }
}
 
