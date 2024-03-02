/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contra_examen;

/**
 *
 * @author HP AiO
 */
public class CONTRA_EXAMEN {

    public static void main(String[] args) {
         // Ejemplo de uso
        Password password = new Password("miUsuario", "miContrasenia");

        // Verificar el acceso con datos proporcionados por el usuario
        boolean accesoCorrecto = password.verificarAcceso("miUsuario", "miContrasenia");

        // Imprimir el resultado
        if (accesoCorrecto) {
            System.out.println("Acceso permitido.");
        } 
        else {
            System.out.println("Acceso denegado.");
        }
    }
}
