package org.example;

public class Tarefa {
    //atributos
    private String nome;
    private String prazo;
    private boolean concluida;

    //construtor
    public Tarefa(String nome, String data){
        this.nome = nome;
        this.prazo = data;
        this.concluida = false;
    }

    //getter
    public String getNome() {
        return nome;
    }

    public String getPrazo() {
        return prazo;
    }

    public boolean isConcluida() {
        return concluida;
    }

    //metodos
    public void concluirTarefa() {
        concluida = true;
    }

    public void alterarPrazo( String novaData) {
        this.prazo = novaData;
    }
}
