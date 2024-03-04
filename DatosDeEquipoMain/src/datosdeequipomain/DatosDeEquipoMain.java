/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datosdeequipomain;

/**
 *
 * @author Axel
 */
public class DatosDeEquipoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] numerosControl = {"23550382","23550063","C20550320","23550330"};
        String[] carreras = {"Ingenieria Informática","Ingenieria Informática","Ingenieria Informática","Ingenieria Informática"};
        String[] nombres = {"Saúl Alejandro", "Maximiliano", "Jorge Axel","Angel Yahir"};
        String[] apellidos = {"Bermudez Arzaga", "Bernal Martinez", "Lares Estrada","Ponce Banda"};
        String nombreEquipo = "Bisonteam";
        String[] problemasResueltos = {"Clase contraseña", "Clase pelicula", "Clase banco","Clase empleado"};

        // Llamadas a los métodos estáticos para imprimir los datos del equipo y los problemas resueltos
        DatosIntegrantes.imprimirDatosEquipo(numerosControl, carreras, nombres, apellidos, nombreEquipo);
        System.out.println();
        DatosIntegrantes.imprimirProblemasResueltos(problemasResueltos);
    }
    
}
