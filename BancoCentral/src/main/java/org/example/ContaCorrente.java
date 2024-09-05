package org.example;

public class ContaCorrente extends  ContaBancaria{

    private double creditoSaque;
    public ContaCorrente(double saldo, String numeroConta, double creditoSaque) {
        super(saldo, numeroConta);
        this.creditoSaque = creditoSaque;
    }

    public double getCreditoSaque() {
        return creditoSaque;
    }

    // saldo = 100 limite = 1000 -> 1100
    @Override
    public void sacar(double saque) {
        double total = creditoSaque + getSaldo();
        if(total >= saque){
            double resultado =  getSaldo() - saque;
            setSaldo(resultado);
            //setSaldo(getSaldo()-saque);
        }
    }

    @Override
    public void imprimirTipoConta() {
        System.out.println("Conta numero "+ getNumeroConta() +"é conta corrente.");
    }
}
