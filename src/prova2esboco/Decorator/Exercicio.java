/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.Decorator;

import java.util.List;
import prova2esboco.equipamentos.Equipamento;
import prova2esboco.exercicio.TipoExercicio;
import prova2esboco.exercicio.TipoGrupoMuscular;
import prova2esboco.flyweight.Video;

/**
 *
 * @author HAPPY
 */
public abstract class Exercicio {
    
    protected String nome;
    protected List<TipoExercicio> tipos;
    protected List<TipoGrupoMuscular> grupos;
    protected List<Equipamento> equipamentos;
    private Video video;
    
    public Exercicio(String nome, List<TipoExercicio> tipos, List<TipoGrupoMuscular> grupos, List<Equipamento> equipamentos,Video video){
        this.nome = nome;
        this.tipos = tipos;
        this.grupos = grupos;
        this.equipamentos = equipamentos;
        this.video = video;
    }
    
    public Exercicio(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipos(List<TipoExercicio> tipos) {
        this.tipos = tipos;
    }

    public void setGrupos(List<TipoGrupoMuscular> grupos) {
        this.grupos = grupos;
    }

    public void setEquipamentos(List<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
    
    public abstract List<TipoGrupoMuscular> getGrupos();
    
    public abstract List<TipoExercicio> getTipos();
    
    public abstract List<Equipamento> getEquipamentos();
    
}
