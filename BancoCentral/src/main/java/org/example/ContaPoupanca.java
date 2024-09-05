package org.example;

public class ContaPoupanca extends ContaBancaria{

    private double taxaRendimento;

    public ContaPoupanca(double saldo, String numeroConta, double taxaRendimento) {
        super(saldo, numeroConta);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void sacar(double saque) {
        if(getSaldo()>=saque){
            setSaldo(getSaldo() - saque);
        }
    }

    @Override
    public void imprimirTipoConta() {
        System.out.println("A conta é poupança.");
    }

    public void aplicacao(){
        double resultado = getSaldo() * (1+taxaRendimento);
        //100  -> 0,05  = 105
        //100 * 1,05 = 105
      setSaldo(resultado);
    }
}
