/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.builder;

import prova2esboco.Decorator.Exercicio;
import prova2esboco.Decorator.ExercicioCombinado;
import prova2esboco.equipamentos.Equipamento;
import prova2esboco.exercicio.TipoExercicio;
import prova2esboco.exercicio.TipoGrupoMuscular;
import prova2esboco.flyweight.Video;

/**
 *
 * @author HAPPY
 */
public interface ExercicioCombinadoFactory {
    public ExercicioCombinadoFactory reset();
    public ExercicioCombinadoFactory setNome(String nome);
    public ExercicioCombinadoFactory addTipo(TipoExercicio tipo);
    public ExercicioCombinadoFactory addGrupoMuscular(TipoGrupoMuscular grupo);
    public ExercicioCombinadoFactory addEquipamento(Equipamento equipamento);
    public ExercicioCombinadoFactory withExercicio(Exercicio exercicio);
    public ExercicioCombinadoFactory setVideo(Video video);
    public ExercicioCombinado build();
}
