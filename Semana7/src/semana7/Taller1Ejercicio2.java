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
public class Taller1Ejercicio2 {

    public static void main(String[] args) {
        String nombre_padre = "";
        int persona;
        String nombre;
        double sueldo;
        double pasaje;
        int contador;
        double bar;
        double salida;
        double total_pasaje = 0;
        double total_bar = 0;
        double total_salida = 0;
        boolean bandera = true;
        double gasto_total = 0;
        String reporte = "";
        while (bandera) {
            
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese el Nombre de Padre de Familia: ");
            nombre_padre = entrada.nextLine();
            System.out.println("Ingrese el total de hijos: ");
            persona = entrada.nextInt();
            System.out.println("Ingrese el valor de su sueldo: ");
            sueldo = entrada.nextDouble();
            reporte = String.format("%s%s\n%s%s\n%s%.2f\n%s%d",reporte, "Reporte Gastos de Padre de Familia", "Nombre de Padre de Familia: ", nombre_padre, "Sueldo Semanal", sueldo, "Nummero de hijos: ", persona);

            entrada.nextLine();

            for (contador = 1; contador <= persona; contador++) {
                System.out.printf("Ingrese el nombre de hijo %d: ", contador);
                nombre = entrada.nextLine();
                System.out.printf("Ingrese el pasaje de hijo %d: ", contador);
                pasaje = entrada.nextDouble();
                System.out.printf("Ingrese el valor que gasta en bar el hijo %d: ", contador);
                bar = entrada.nextDouble();
                System.out.printf("Ingrese el valor que gasta por salida el hijo %d: ", contador);
                salida = entrada.nextDouble();
                total_pasaje = total_pasaje + pasaje;
                total_bar = total_bar + bar;
                total_salida = total_salida + salida;
                entrada.nextLine();
                reporte = String.format("%s%s\t%.2f\t%.2f\t%.2f\n", reporte, nombre, pasaje, bar, salida);
            }
            gasto_total = total_bar + total_pasaje + total_salida;

            entrada.nextLine();

            reporte = String.format("%s%s\t%.2f\t%.2f\t%.2f\n", reporte, "Totales:", total_pasaje, total_bar, total_salida);

            if (gasto_total < sueldo) {
                reporte = String.format("%s\n%s", reporte, "Al padre de familia le sobra dinero");
            } else {
                reporte = String.format("%s\n%s", reporte, "Al padre de familia le falta dinero");
            }

            System.out.println("¿Desea añadir otro reporte?");
            String temporal = entrada.nextLine();
            if (temporal.equals("no")) {
                bandera = false;

            }

        }
        System.out.printf("%s", reporte);
    }
}
