/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Axel
 */
public class CuentaBancaria {
    private String numCuenta;
    private String nomCliente;
    private double saldo;
    
    //contructor
    public CuentaBancaria(){
        this.numCuenta="";
        this.nomCliente="";
        this.saldo=0;
    }
    
    //agrego parametros al contructor
    public CuentaBancaria(String numCuenta,String nomCliente,double saldo){
        this.numCuenta=numCuenta;
        this.nomCliente=nomCliente;
        this.saldo=saldo;
    }
    
    //Setter con parametros
    public void setNumeroCuenta(String numCuenta){
        this.numCuenta=numCuenta;
    }
    
    public void setNombreCliente(String nomCliente){
        this.nomCliente=nomCliente;
    }
    
    //Getter
    public String getNumeroCuenta(){
        return numCuenta;
    }
    
    public String getNombreCliente(){
        return nomCliente;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    //Metodo para el deposito en la cuenta del cliente
    public void depositarEnCuenta(double monto){
        saldo += monto;
    }
    
    //Y este metodo para el retiro
    public void retirarDeCuenta(double monto){
        if (saldo>=monto) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente para el retiro");
        }
    }
    
    //Metodo para imprimir los datos(baucher)
    public void imprimirDatos(){
        System.out.println("Numero de cuenta: "+numCuenta);
        System.out.println("Nombre del cleinte: "+nomCliente);
        System.out.println("Saldo estimado: "+saldo);
    }
}
