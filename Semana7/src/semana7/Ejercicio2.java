/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana7;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    int suma = 0;
    for (int contador =2; contador <= 20; contador +=2){
        suma = suma + contador;
        System.out.printf("%d, ",contador);
    }
    System.out.printf("\n%s%d","La suma es de: ",suma);
}
}