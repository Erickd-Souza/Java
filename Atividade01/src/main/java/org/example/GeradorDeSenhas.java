package org.example;

import java.util.Random;


public class GeradorDeSenhas {
    //--------------------------------------------------
    public static void main(String[] args) {
        GeradorDeSenhas senhaa = new GeradorDeSenhas();
        senhaa.gerarSenha(10,true,true,true,false);
    }
    //--------------------------------------------------
    //atributos
    private String maiusculas;
    private String minusculas;
    private String numeros;
    private String caracter_especiais;

    //metodos
    public String gerarSenha(int i,boolean minusc,boolean maiusc,boolean number,boolean simbolos){
        StringBuilder tudoCarac = new StringBuilder();
        Random ramdom = new Random();
        StringBuilder senha = new StringBuilder(i);
        if(minusc){
           tudoCarac.append(getMinusculas());
        }
        if(maiusc){
            tudoCarac.append(getMaiusculas());
        }
        if(number){
            tudoCarac.append(getNumeros());
        }
        if(simbolos){
            tudoCarac.append(getCaracter_especiais());
        }
        if (tudoCarac.length() == 0) {
            throw new IllegalArgumentException("Nenhuma opção de caracterer selecionada adicione uma opção para gerar uma senha!");
        }
        for (int x=0;x<i;x++){
            int index = ramdom.nextInt(tudoCarac.length());
            senha.append(tudoCarac.charAt(index));

        }
        System.out.print("SENHA GERADA:");
        System.out.println(senha);
        return senha.toString();
    }

    //getter
    public String getMaiusculas() {
        return maiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }

    public String getMinusculas() {
        return minusculas = "abcdefghijklmnopqrstuvwxyz";
    }

    public String getNumeros() {
        return numeros = "0123456789";
    }

    public String getCaracter_especiais() {
        return caracter_especiais="!@#$%^&*()-_=+[]{}|;:',.<>?/";
    }
}