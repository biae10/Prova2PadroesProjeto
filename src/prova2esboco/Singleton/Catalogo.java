/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.Singleton;

import prova2esboco.factory.EquipamentoFactory;
import java.util.ArrayList;
import java.util.List;
import prova2esboco.equipamentos.Equipamento;
import prova2esboco.equipamentos.Halter;
import prova2esboco.equipamentos.TipoEquipamento;

/**
 *
 * @author HAPPY
 */
public class Catalogo {
    
    private List<Equipamento> equipamentos = new ArrayList();
    
    public Equipamento gerarEquipamento(TipoEquipamento tipo,String identificador, int quantidade) throws Exception{
        
        int verifica = 0;
        EquipamentoFactory factory = EquipamentoFactory.retornarFactory(tipo);
        Equipamento equipamento = null;
        
        for(int i = 0; i < this.equipamentos.size(); i++){
            if(this.equipamentos.get(i).getIdentificador() == identificador){
                String nameEq = this.equipamentos.get(i).getClass().getName();
                String nameEnum = tipo.getClassName();
                verifica = 1;
                if(nameEq == nameEnum){
                    equipamento = this.equipamentos.get(i);
                    equipamento.aumentarQuantidade(quantidade);
                }else{
                   throw new Exception("Elemento encontrado com esse identificador, porém a solicitação nova está com um tipo incompatível");
                }
            }
        }
        
        if(this.equipamentos.size() <= 0 || verifica != 1){
            equipamento = factory.gerarEquipamento();
            equipamento.setIdentificador(identificador);
            equipamento.setQuantidade(quantidade);
            this.equipamentos.add(equipamento);
        }
   
        return equipamento;
    }
    
    
}
