/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vinicius;

/**
 *
 * @author SATC
 */
public enum Bebidas {
    b1("Coca-Cola 600ml :","bebida gelada sabor cola",600, (float) 5.00),
    b2("Coca-Cola 1L :","bebida gelada sabor cola",1000, (float) 6.50),
    b3("Coca-Cola 2L :","bebida gelada sabor cola",2000, (float) 8.00),
    b4("Guarana 600ml :","bebida gelada sabor guarana",600, (float) 5.00),
    b5("Guarana 1L :","bebida gelada sabor guarana",1000, (float) 6.50),
    b6("Guarana 2L :","bebida gelada sabor guarana",2000, (float) 8.00),
    b7("Nescal 350ml :","bebida lactia gelada sabor chocolate",350, (float) 2.00),
    b8("Todinho 250ml :","bebida lactia gelada sabor chocolate",250, (float) 1.50),
    b9("Agua sem gás 500ml :","bebida gelada ",500, (float) 2.00),
    b10("Agua com gás 500ml :","bebida gelada co gás ",500, (float) 2.00);

    private String nome;
    private String descricao;
    private int ml;
    private float valor;

    private Bebidas(String nome, String descrição, int ml, float valor) {
        this.nome = nome;
        this.descricao = descrição;
        this.ml = ml;
        this.valor = valor;
        
    }
    
    
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getMl() {
        return ml;
    }

    public float getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "\n" + this.getNome() + this.getDescricao() ;
    }

    

    

   
    
    
}
