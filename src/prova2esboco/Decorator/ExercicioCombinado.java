/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.Decorator;

import java.util.ArrayList;
import java.util.List;
import prova2esboco.equipamentos.Equipamento;
import prova2esboco.exercicio.Exercicio;
import prova2esboco.exercicio.TipoExercicio;
import prova2esboco.exercicio.TipoGrupoMuscular;

/**
 *
 * @author HAPPY
 */
public class ExercicioCombinado extends ExercicioDecorator{
    
    private Exercicio exercicio;
    
    public ExercicioCombinado(String nome, List<TipoExercicio> tipos, List<TipoGrupoMuscular> grupos, List<Equipamento> equipamentos,Exercicio exercicio){
        super(nome, tipos, grupos, equipamentos);
        this.exercicio = exercicio;
       
    }
    
    
    public List<TipoGrupoMuscular> getGrupos(){
        
        List<TipoGrupoMuscular> total = new ArrayList();
        //return this.exercicio.getGrupos + this.grupos;
        total.addAll(this.exercicio.getGrupos());
        total.addAll(this.grupos);
        return total;
    }
    
}
