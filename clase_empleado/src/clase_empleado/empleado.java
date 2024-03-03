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
    
    public void imp_datos (){
        System.out.println(" nombre del empleado es "+nombre + " "+apellido);

        System.out.println("La direccion del usuario es "+direccion);
        System.out.println("El año de ingreso es "+anio_ingreso);
        System.out.println("El salario es "+salario);
    
    }
    

}
