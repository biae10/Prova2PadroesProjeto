/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.factory;

import prova2esboco.equipamentos.Maquina;

/**
 *
 * @author HAPPY
 */
public class MaquinaFactory extends EquipamentoFactory{

    @Override
    public prova2esboco.equipamentos.Equipamento gerarEquipamento() {
        return new Maquina();
    }
    
}
