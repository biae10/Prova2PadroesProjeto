/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.builder;

import prova2esboco.exercicio.Exercicio;
import prova2esboco.exercicio.TipoExercicio;
import prova2esboco.exercicio.TipoGrupoMuscular;
import prova2esboco.equipamentos.Equipamento;

/**
 *
 * @author HAPPY
 */
public interface ExercicioFactory {
    
    public ExercicioFactory reset();
    public ExercicioFactory setNome(String nome);
    public ExercicioFactory addTipo(TipoExercicio tipo);
    public ExercicioFactory addGrupoMuscular(TipoGrupoMuscular grupo);
    public ExercicioFactory addEquipamento(Equipamento equipamento);
    public Exercicio build();
 
}
