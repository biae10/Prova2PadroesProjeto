/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.builder;

import java.util.ArrayList;
import java.util.List;
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
public class ExercicioCombinadoBuilder implements ExercicioCombinadoFactory{

    private String nome;
    private List<TipoExercicio> tipos;
    private List<TipoGrupoMuscular> grupos;
    private List<Equipamento> equipamentos;
    private Exercicio exercicio;
    private Video video;
    
    @Override
    public ExercicioCombinadoFactory reset() {
        this.nome = "";
        this.tipos = new ArrayList();
        this.grupos = new ArrayList();
        this.equipamentos = new ArrayList();
        this.exercicio = null;
        return this;
    }

    @Override
    public ExercicioCombinadoFactory setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public ExercicioCombinadoFactory addTipo(TipoExercicio tipo) {
        this.tipos.add(tipo);
        return this;
    }

    @Override
    public ExercicioCombinadoFactory addGrupoMuscular(TipoGrupoMuscular grupo) {
        this.grupos.add(grupo);
        return this;
    }

    @Override
    public ExercicioCombinadoFactory addEquipamento(Equipamento equipamento) {
        this.equipamentos.add(equipamento);
        return this;
    }

    @Override
    public ExercicioCombinadoFactory withExercicio(Exercicio exercicio) {
        this.exercicio = exercicio;
        return this;
    }

     @Override
    public ExercicioCombinadoFactory setVideo(Video video) {
        this.video = video;
        return this;
    }
    
    @Override
    public ExercicioCombinado build() {
        return new ExercicioCombinado(this.nome,this.tipos, this.grupos, this.equipamentos, this.exercicio,video);
    }

}
