/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.equipamentos;

/**
 *
 * @author HAPPY
 */
public abstract class Equipamento {
    
    private String identificador;
    private int quantidade;
    
    public Equipamento(){
        this.identificador = null;
        this.quantidade = 0;
    }
    
    public Equipamento(String identificador, int quantidade){
        this.identificador = identificador;
        this.quantidade = quantidade;
    }
    
    public void aumentarQuantidade(int qtd){
        this.quantidade = this.quantidade + qtd;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
