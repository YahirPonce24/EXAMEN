/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author Axel
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //El saldo inicial sera de 90 pesos
        CuentaBancaria cuenta=new CuentaBancaria("20550320","Jorge Axel Lares Estrada",90);
        //imprimir baucher inicial
        cuenta.imprimirDatos();
        //ingreso de monto de 10 pesos
        cuenta.depositarEnCuenta(10);
        //imprimir 2do baucher
        cuenta.imprimirDatos();
        
        //retiramos 50
        cuenta.retirarDeCuenta(50);
        //imprimir 3er baucher
        cuenta.imprimirDatos();
        //retiramos de más para arrojar error de saldo insuficiente
        cuenta.retirarDeCuenta(150);
        
       
    }
    
}
