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
public enum TipoEquipamento {
    
    Acessorio("prova2esboco.equipamentos.Acessorio"),
    Maquina("prova2esboco.equipamentos.Maquina"), 
    Halter("prova2esboco.equipamentos.Halter");
    
    String className;
    
    TipoEquipamento(String tipo){
        this.className = tipo;
    }
    
    public String getClassName(){
        return this.className;
    }
}
