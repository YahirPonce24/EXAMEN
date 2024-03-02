/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_mostrar_info_alum;
import java.util.Scanner;
/**
 *
 * @author MAX
 */
public class Examen_MOSTRAR_INFO_ALUM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner  lee =new  Scanner (System.in);
       
        CLASES alumnos = new CLASES();
        
        
        alumnos.setnombre("1:Saúl Alejandro Bermudez Arzaga - 2:maximiliano Bernal Martinez-3:Jorge Axel Lares Estrada-4:ANGEL YAHIR PONCE BANDA ");
        System.out.println( "Alumnos:"+alumnos.getnoombre());
     
        alumnos.setnmc("1:23550382 2:23550063-3:C20550320-4:23550330");
        System.out.println("nmc:"+alumnos.getnmc());
       
       }

}
