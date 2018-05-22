/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class EjercicioDoWhile {

    public static void main(String[] args) {
        String nombre;
        int pases;
        int goles;
        int totalpartidos;
        int jugadores = 0;
        double prom_pases = 0;
        double prom_goles = 0;
        String nivel = "";
        String reporte = "";
        boolean bandera = true;
        Scanner entrada = new Scanner(System.in);
        reporte = String.format("Reporte de jugadores del Equipo UTPL\n\nNombre del jugador\tTotal dePases\tTotal de goles\tNivel de jugador\n\n");
        while (bandera) {
            int contpartidos = 1;
            int totalpases = 0;
            int totalgoles = 0;
            System.out.println("Ingrese el Nombre de Jugador: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el total de partidos jugados: ");
            totalpartidos = entrada.nextInt();

            do {
                System.out.printf("Ingrese el total de pases del partido %s ", contpartidos);
                pases = entrada.nextInt();
                System.out.printf("Ingrese el total de goles del partido %s ", contpartidos);
                goles = entrada.nextInt();
                totalpases = totalpases + pases;
                totalgoles = totalgoles + goles;
                reporte = String.format("%s%s\t%s%d: %d\t\t\t%s%d: %d\t\n", reporte, nombre, "P", contpartidos, pases, "P", contpartidos, goles);
                contpartidos = contpartidos + 1;
                entrada.nextLine();

                if (totalpases >= 100) {
                    nivel = "Excelente";
                } else if (totalpases >= 80 && totalpases <= 99) {
                    nivel = "Muy Bueno";
                } else if (totalpases >= 60 && totalpases <= 79) {
                    nivel = "Bueno";
                } else if (totalpases <= 59) {
                    nivel = "Regular";
                }

                prom_pases = prom_pases + totalpases;
                prom_goles = prom_goles + totalgoles;

            } while (contpartidos <= totalpartidos);
            entrada.nextLine();
            reporte = String.format("%s\t%s%d\t\t\t%s%d\t\t%s\n", reporte, "Total: ", totalpases, "Total: ", totalgoles, nivel);

            System.out.println("¿Desea añadir otro jugador?");
            String temporal = entrada.nextLine();
            if (temporal.equals("no")) {
                bandera = false;
            }
            jugadores = jugadores + 1;
            prom_pases = prom_pases / jugadores;
            prom_goles = prom_goles / jugadores;
        }
        System.out.printf("%s\n\n%s\n%d%s\n%s%.2f\n%s%.2f\n\n%s\n", reporte, "Datos finales: ", jugadores, "Jugadores Analizados.", "Promedio de Pases del equipo es de: ", prom_pases,
                "Promedio de Goles del equipo es de: ", prom_goles, "DEPARTAMENTO ESTADISTICO");

    }
}
