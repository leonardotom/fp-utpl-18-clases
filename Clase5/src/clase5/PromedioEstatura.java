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
public class PromedioEstatura {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        int contador = 1;
        double suma_total = 0;
        double promedio_final = 0;
        boolean bandera = true;
        String cadena_final ="";
        cadena_final = String.format("%s\n","Estaturas:");
        System.out.println("Ingrese la estatura de los estudiantes: ");
        while (bandera){
            System.out.printf("Ingrese estatura número %d\n", contador);
            double valor = entrada.nextDouble();
            suma_total = suma_total + valor;
            contador = contador + 1;
            cadena_final= String.format("%s%f\n",cadena_final, valor);
            if( valor > 1.20 ){
                valor = 1.20;
            }
            entrada.nextLine(); // Ojo usamos el limpiador del scanner.
            // proceso para salir del ciclo.
            
            System.out.println("Digite si, si desea salir");
            String temporal = entrada.nextLine();
            if(temporal.equals("si")){
                bandera = false;
            }
        }
        promedio_final = suma_total/contador;
        System.out.printf("%s",cadena_final);
        System.out.printf("Promedio de estaturas: %.2f\n", promedio_final);
        
    }
    
}
