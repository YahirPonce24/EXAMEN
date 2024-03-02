/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peliculamain;

/**
 *
 * @author Axel
 */
public class Pelicula {
    //Atributos para pelicula,estudio,clasificacion de edad
    private String titulo;
    private String estudio;
    private int rating;

    //Contructor para los atrributos
    public Pelicula(String titulo, String estudio, int rating) {
        this.titulo = titulo;
        this.estudio = estudio;
        this.rating = rating;
    }

    //Metodos set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    //Metodos get
    public String getTitulo() {
        return titulo;
    }

    public String getEstudio() {
        return estudio;
    }

    public int getRating() {
        return rating;
    }

    //Metodo para imprimir datos
    public void imprimirDatos() {
        System.out.println("Título: " + titulo);
        System.out.println("Estudio: " + estudio);
        System.out.println("Rating: " + rating);
    }

    // Método para evaluar la edad del espectador
    public void evaluarEdad(int edad){
        if (edad >=rating) {
            System.out.println("Puedes ver la pelicula");
        } else {
            System.out.println("No puedes ver la pelicula");
        }
    }

}
