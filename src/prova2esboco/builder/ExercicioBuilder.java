/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.builder;

import prova2esboco.exercicio.Exercicio;
import prova2esboco.exercicio.TipoExercicio;
import prova2esboco.exercicio.TipoGrupoMuscular;
import java.util.ArrayList;
import java.util.List;
import prova2esboco.equipamentos.Equipamento;

/**
 *
 * @author HAPPY
 */
public class ExercicioBuilder implements ExercicioFactory{
    
    private String nome;
    private List<TipoExercicio> tipos;
    private List<TipoGrupoMuscular> grupos;
    private List<Equipamento> equipamentos;

    @Override
    public ExercicioFactory reset() {
        this.nome = null;
        this.tipos = new ArrayList();
        this.grupos = new ArrayList();
        this.equipamentos = new ArrayList();
        return this;
    }

    @Override
    public ExercicioFactory setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public ExercicioFactory addTipo(TipoExercicio tipo) {
        this.tipos.add(tipo);
        return this;
    }

    @Override
    public ExercicioFactory addGrupoMuscular(TipoGrupoMuscular grupo) {
        this.grupos.add(grupo);
        return this;
    }

    @Override
    public ExercicioFactory addEquipamento(Equipamento equipamento) {
        this.equipamentos.add(equipamento);
        return this;
    }

    @Override
    public Exercicio build() {
        return new Exercicio(nome,tipos,grupos,equipamentos);
    }
    
}
