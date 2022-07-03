/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.exercicio;

import java.util.List;
import prova2esboco.equipamentos.Equipamento;

/**
 *
 * @author HAPPY
 */
public class Exercicio {
    
    private String nome;
    private List<TipoExercicio> tipos;
    private List<TipoGrupoMuscular> grupos;
    private List<Equipamento> equipamentos;

    public Exercicio(String nome, List<TipoExercicio> tipos, List<TipoGrupoMuscular> grupos, List<Equipamento> equipamentos) {
        this.nome = nome;
        this.tipos = tipos;
        this.grupos = grupos;
        this.equipamentos = equipamentos;
    }

    public Exercicio(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<TipoExercicio> getTipos() {
        return tipos;
    }

    public void setTipos(List<TipoExercicio> tipos) {
        this.tipos = tipos;
    }

    public List<TipoGrupoMuscular> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<TipoGrupoMuscular> grupos) {
        this.grupos = grupos;
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }
    
}
