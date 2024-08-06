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

public class CuentaCorriente extends  CuentaBancaria {

    private Double  limiteSobregiro;

    public CuentaCorriente(Double saldo, Double limiteSobregiro) {
        super(saldo);
        this.limiteSobregiro = limiteSobregiro;
    }

    public static void main( String[] args){
        CuentaCorriente cuenta = new CuentaCorriente(100.0, 50.0);
        cuenta.depositar(100.0);
        cuenta.retirar(200.0);
        
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
       System.out.println(getSaldo());
    }
    
    @Override
    public void retirar(double monto) {
        if(monto > saldo + limiteSobregiro){
            System.out.println("No se puede retirar el monto");
            return;
        }else{
            saldo -= monto;
        }
        System.out.println(getSaldo());
       
    }

   
}

