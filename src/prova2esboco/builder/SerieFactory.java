/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.builder;

import prova2esboco.exercicio.Exercicio;
import prova2esboco.exercicio.Serie;

/**
 *
 * @author HAPPY
 */
public interface SerieFactory {
    
    public SerieFactory reset();
    public SerieFactory setNumeroRepeticoes(int repeticoes);
    public SerieFactory setQuantidade(int quantidade);
    public SerieFactory setExercicio(Exercicio exercicio);
    public Serie build();
    
}
