package com.mycompany.lojadecalcados;

public class Pedido {

    private int quantidade;
    private double preco;
    private String data;

    Produto produto1 = new Produto("Tênis",4);
    
    public Pedido(int quantidade, double preco, String data) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.data = data;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setData(String data){
        this.data = new String(data);
    }
}
