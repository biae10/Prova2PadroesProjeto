/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.factory;

import prova2esboco.equipamentos.Acessorio;
import prova2esboco.equipamentos.Equipamento;

/**
 *
 * @author HAPPY
 */
public class AcessorioFactory extends EquipamentoFactory{

    @Override
    public Equipamento gerarEquipamento() {
        return new Acessorio();
    }

 
    
}
