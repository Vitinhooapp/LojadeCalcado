package com.mycompany.lojadecalcados;

public class Produto {

    private String tipo;
    private int quantidade;
    
    public Produto(String tipo, int quantidade){
    this.tipo = tipo;
    this.quantidade = quantidade;
    }
    
    public void setTipo(String tipo){
    this.tipo = new String(tipo);
    }
    public void setQuantidade(int quantidade){
    this.quantidade = quantidade;
    }
}
