package org.example;

public class Pontuacao {
    private int pontuacao;

    //metodos
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    public void adicionarPontos(int i) {
        pontuacao =+ i;
    }

    public void removerPontos(int i) {
        if(pontuacao - i < 0 ){

        }else{
            pontuacao = pontuacao - i;
        }

    }

    //getter
    public int getPontuacao() {
        return pontuacao;
    }


}
