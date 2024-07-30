package abstraccion;

public abstract class CuentaBancaria {

    protected double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public abstract void depositar(double monto);

    public abstract void retirar(double monto);
    
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}

