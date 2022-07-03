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
public class Acessorio extends Equipamento{
    
    private String descricao;
    private String marca;

    public Acessorio(String descricao, String marca) {
        this.descricao = descricao;
        this.marca = marca;
    }
    
    public Acessorio(){}

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
