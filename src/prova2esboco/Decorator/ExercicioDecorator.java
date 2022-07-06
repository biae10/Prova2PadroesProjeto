/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.Decorator;

import java.util.List;
import prova2esboco.equipamentos.Equipamento;
import prova2esboco.exercicio.ExercicioSimples;
import prova2esboco.exercicio.TipoExercicio;
import prova2esboco.exercicio.TipoGrupoMuscular;
import prova2esboco.flyweight.Video;

/**
 *
 * @author HAPPY
 */
public abstract class ExercicioDecorator extends Exercicio{
    
    public ExercicioDecorator(String nome, List<TipoExercicio> tipos, List<TipoGrupoMuscular> grupos, List<Equipamento> equipamentos, Video video) {
        super(nome, tipos, grupos, equipamentos,video);
    }

}
