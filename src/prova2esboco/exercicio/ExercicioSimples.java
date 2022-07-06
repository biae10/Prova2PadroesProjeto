/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.exercicio;

import java.util.List;
import prova2esboco.Decorator.Exercicio;
import prova2esboco.equipamentos.Equipamento;

/**
 *
 * @author HAPPY
 */
public class ExercicioSimples extends Exercicio{

    public ExercicioSimples(String nome, List<TipoExercicio> tipos, List<TipoGrupoMuscular> grupos, List<Equipamento> equipamentos) {
        super(nome, tipos, grupos, equipamentos);
    }
    
    public ExercicioSimples(String nome){
        super(nome);
    }

    @Override
    public List<TipoGrupoMuscular> getGrupos() {
        return this.grupos;
    }

    @Override
    public List<TipoExercicio> getTipos() {
        return this.tipos;
    }

    @Override
    public List<Equipamento> getEquipamentos() {
        return this.equipamentos;
    }
   
}
