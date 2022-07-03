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
public class Maquina extends Equipamento{
    
    private String descricao;

    public Maquina(String identificador, int quantidade, String descricao) {
        super(identificador, quantidade);
        this.descricao = descricao;
    }

    public Maquina(){}
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
