/**
 * The `abstraccion` package contains classes related to abstraction in Java.
 * This package provides classes and interfaces that define abstract concepts and behaviors.
 * It is used to create a higher level of abstraction and to hide the implementation details.
 */
package abstraccion;

public class CuentaAhorro extends  CuentaBancaria {
    private Double  limiteSobregiro;

    public CuentaAhorro(Double saldo, Double limiteSobregiro) {
        super(saldo);
        this.limiteSobregiro = limiteSobregiro;
    }

    public static void main( String[] args){
        CuentaAhorro cuenta = new CuentaAhorro(100.0, 50.0);
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
        if(monto > saldo && monto<=limiteSobregiro){
            System.out.println("No se puede retirar el monto");
            return;
        }else{
            saldo -= monto;
        }
        System.out.println(getSaldo());
       
    }

}
