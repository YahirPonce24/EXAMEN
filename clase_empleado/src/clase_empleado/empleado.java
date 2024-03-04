/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_empleado;

/**
 *
 * @author Yahir
 */
public class empleado {
    
    private String nombre;
    private String apellido;
    private String direccion;
    private int anio_ingreso;
    private double salario;

    public Empleado() {
        //Constructor sin parametro
        this.nombre = "Jorge";
        this.apellido = "Lares";
        this.direccion = "Calle imaginario 3434";
        this.anio_ingreso = 2023;
        this.salario = 500.0;
    }
    
    public Empleado(String nombre, String apellido, String direccion, int anio_ingreso, double salario) {
        //Con parametro
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.anio_ingreso = anio_ingreso;
        this.salario = salario;
    }

    
    //get y set
    
    public String getNombre(){
    return nombre;
    }
    public void setNombre (String valor){
    nombre = valor;
    }
    public String getApellido(){
    return apellido;
    }
    public void setApellido (String valor){
    apellido = valor;
    }
    public String getDireccion(){
    return direccion;
    }
    public void setDireccion (String valor){
    direccion = valor;
    }
    public int getAnio(){
    return anio_ingreso;
    }
    public void setAnio (int valor){
    anio_ingreso = valor;
    }
    public double getSalario(){
    return salario;
    }
    public void setSalario (double valor){
    salario = valor;
    }
    //Calcular vacaciones
    public int calcularVacaciones() {
        int antiguedad = 2024 - anio_ingreso;
        //6 días de vacaciones para un año de antigüedad
        int diasVacaciones = 6; 

        //Dos días de vacaciones por cada año adicional
        diasVacaciones += (antiguedad - 1) * 2;

        //Dos días de vacaciones por cada 5 años laborados
        diasVacaciones += (antiguedad / 5) * 2;

        return diasVacaciones;
    }
    
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Dirección: " + direccion);
        System.out.println("Año de Ingreso: " + anio_ingreso);
        System.out.println("Salario: " + salario);
        System.out.println("Días de Vacaciones: " + calcularVacaciones());
    }
    

}
