/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Edades {
     public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     int edad = 0;
     int suma = 0;
     int contador = 1;
     String cadena_final ="";
     cadena_final = String.format("%s\t%s\n","Edad","Suma");
         while (contador <=5){
             System.out.println("Ingrese la edad: ");
             edad = entrada.nextInt();
             suma = suma + edad;
             cadena_final= String.format("%s%d\t%d\n",cadena_final, edad, suma);
             contador = contador +1;
             
         }
     System.out.printf("%s",cadena_final);
     }
     
}
