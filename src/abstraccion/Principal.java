/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author ACER
 */
public class Principal {
    public static void main(String[] args) {
        //  instancias  
        CuentaAhorro cuentaAhorro = new CuentaAhorro(100.0, 50.0);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(100.0, 50.0);

        // operaciones ahorro
        System.out.println("Cuenta de Ahorro:");
        System.out.println("Saldo inicial: " + cuentaAhorro.getSaldo());
        cuentaAhorro.depositar(100.0);
        System.out.println("Saldo después del depósito: " + cuentaAhorro.getSaldo());
        cuentaAhorro.retirar(200.0);
        System.out.println("Saldo después del retiro: " + cuentaAhorro.getSaldo());

        // Operaciones cuenta corriente
        System.out.println("\nCuenta Corriente:");
        System.out.println("Saldo inicial: " + cuentaCorriente.getSaldo());
        cuentaCorriente.depositar(100.0);
        System.out.println("Saldo después del depósito: " + cuentaCorriente.getSaldo());
        cuentaCorriente.retirar(200.0);
        System.out.println("Saldo después del retiro: " + cuentaCorriente.getSaldo());
    }
}
