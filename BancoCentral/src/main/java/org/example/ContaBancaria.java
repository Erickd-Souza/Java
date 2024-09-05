package org.example;

public abstract class ContaBancaria {
   private double saldo;
   private String numeroConta;

   //construtor
    public ContaBancaria(double saldo, String numeroConta) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    //getter
    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    //setter
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //métodos
    public void depositar(double deposito){
        saldo += deposito;
    }
    public abstract void sacar(double saque);

    public abstract void imprimirTipoConta();
}
