/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contra_examen;

/**
 *
 * @author HP AiO
 */
class Password {
     // Atributos de la clase
    private String usuario;
    private String contrasenia;

    // Constructor SIN PARAMETROS
    // referencia a los miembros de la clase como atributos y métodos dentro de la propia clase
    public Password() {
        // Inicializar los atributos con valores predeterminados
        this.usuario = "usuarioPredeterminado"; 
    // "this.usuario" se refiere al atributo de la clase
        this.contrasenia = "contraseniaPredeterminada";
    }

    // Constructor CON PARÁMETROS
    public Password(String usuario, String contrasenia) {
        // Inicializar los atributos con los valores proporcionados por el usuario
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    // Métodos set para capturar los valores de los atributos
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    // Método para verificar el acceso
    public boolean verificarAcceso(String usuario, String contrasenia) {
        // Comparar los valores proporcionados con los valores guardados
        return this.usuario.equals(usuario) && this.contrasenia.equals(contrasenia);
    }
}
