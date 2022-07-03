/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.factory;

import prova2esboco.equipamentos.Equipamento;
import prova2esboco.equipamentos.TipoEquipamento;

/**
 *
 * @author HAPPY
 */
public abstract class EquipamentoFactory {
    
    public static EquipamentoFactory retornarFactory(TipoEquipamento tipo){
        EquipamentoFactory factory = null;
        if(tipo == TipoEquipamento.Acessorio){
            factory = new AcessorioFactory();
        }else if(tipo == TipoEquipamento.Halter){
           factory = new HalterFactory();
        }else if(tipo == TipoEquipamento.Maquina){
            factory = new MaquinaFactory();
        } 
        return factory;
    }
    
    public abstract Equipamento gerarEquipamento();
    
}
