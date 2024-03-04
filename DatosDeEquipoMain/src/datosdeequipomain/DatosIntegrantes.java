/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datosdeequipomain;

/**
 *
 * @author Axel
 */
public class DatosIntegrantes {
    public static void imprimirDatosEquipo(String[] numerosControl, String[] carreras, String[] nombres, String[] apellidos, String nombreEquipo) {
        System.out.println("Datos de los integrantes del equipo:");
        for (int i = 0; i < numerosControl.length; i++) {
            System.out.println("Número de control: " + numerosControl[i]);
            System.out.println("Carrera: " + carreras[i]);
            System.out.println("Nombre completo: " + nombres[i] + " " + apellidos[i]);
            System.out.println();
        }
        System.out.println("Nombre del equipo: " + nombreEquipo);
    }
    
    public static void imprimirProblemasResueltos(String[] problemasResueltos) {
        System.out.println("Problemas resueltos en el examen práctico:");
        for (String problema : problemasResueltos) {
            System.out.println("- " + problema);
        }
    }
    
    
}
