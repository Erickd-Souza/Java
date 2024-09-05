package org.example;

public class Banco {
    public static void main(String[] args) {
       // ContaCorrente inter = new ContaCorrente(100.00, "123252-2", 1000.00);
       // System.out.println("Qual o número da conta? "+ inter.getNumeroConta());
       //  inter.imprimirTipoConta();

       // System.out.println("Qual o saldo atual? "+ inter.getSaldo());
      //  System.out.println("Qual o crédito? "+ inter.getCreditoSaque());
       // inter.depositar(100);
      //  inter.sacar(1100.00);
      //  System.out.println("Qual o saldo atual? "+ inter.getSaldo());

        ContaPoupanca nu = new ContaPoupanca(100.00,"33301",0.05);
        System.out.println("Qual o tipo?");
        nu.imprimirTipoConta();
        System.out.println("Qual é o saldo atual? " + nu.getSaldo());
        nu.aplicacao();
        System.out.println("Qual é o saldo atual? " + nu.getSaldo());
    }
}
