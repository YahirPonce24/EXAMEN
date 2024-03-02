/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peliculamain;

import java.util.Scanner;

/**
 *
 * @author Axel
 */
public class PeliculaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //importar scanner para capturar la edad
        Scanner leer=new Scanner(System.in);
        Pelicula movie=new Pelicula("Poor Things","Searchlight Pictures",18);
        movie.imprimirDatos();
        //pedir al usuario la edad
        System.out.print("Ingresa tu edad: ");
        int edad = leer.nextInt();
        //luego de crear una instancia de Pelicula
        movie.evaluarEdad(edad);
        
    }
}
    

