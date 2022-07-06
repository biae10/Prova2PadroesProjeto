/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.Decorator;

import java.util.ArrayList;
import java.util.List;
import prova2esboco.equipamentos.Equipamento;
import prova2esboco.exercicio.TipoExercicio;
import prova2esboco.exercicio.TipoGrupoMuscular;
import prova2esboco.flyweight.Video;

/**
 *
 * @author HAPPY
 */
public class ExercicioCombinado extends ExercicioDecorator{
    
    private Exercicio exercicio;
    
    public ExercicioCombinado(String nome, List<TipoExercicio> tipos, List<TipoGrupoMuscular> grupos, List<Equipamento> equipamentos,Exercicio exercicio,Video video){
        super(nome, tipos, grupos, equipamentos,video);
        this.exercicio = exercicio;
    }
    
    @Override
    public List<TipoGrupoMuscular> getGrupos() {
        List<TipoGrupoMuscular> total = new ArrayList();
        total.addAll(this.exercicio.getGrupos());
        total.addAll(this.grupos);
        return total;
    }
    
    @Override
    public List<TipoExercicio> getTipos() {
        List<TipoExercicio> total = new ArrayList();
        total.addAll(this.exercicio.getTipos());
        total.addAll(this.tipos);
        return total;
    }

    @Override
    public List<Equipamento> getEquipamentos() {
       List<Equipamento> total = new ArrayList();
       total.addAll(this.exercicio.getEquipamentos());
       total.addAll(this.equipamentos);
       return total;
    }
 
}
