package com.mycompany.lojadecalcados;

public class Cliente {
    
    Pedido pedido1 = new Pedido(1, 45.00,"14/10/22");
    
    private String nome;
    private String email;
    private long telefone;
    private String endereco;
        
    public Cliente(String nome, String email, long telefone, String endereco){
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
    this.endereco = endereco;
    }
    
    public void setNome(String nome){
        this.nome = new String(nome);
    }
    public void setEmail(String email){
        this.email = new String(email);
    }
    public void setTelefone(long telefone){
        this.telefone = telefone;
    }
    public void setEndereco(String endereco){
        this.endereco = new String(endereco);
    }
    
    
}
