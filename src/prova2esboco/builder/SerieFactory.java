/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.builder;

import prova2esboco.exercicio.ExercicioSimples;
import prova2esboco.exercicio.Serie;

/**
 *
 * @author HAPPY
 */
public interface SerieFactory {
    
    public SerieFactory reset();
    public SerieFactory setNumeroRepeticoes(int repeticoes);
    public SerieFactory setQuantidade(int quantidade);
    public SerieFactory setExercicio(ExercicioSimples exercicio);
    public Serie build();
    
}
