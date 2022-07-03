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
public class SerieBuilder implements SerieFactory{
    
    private int numeroRepeticoes;
    private int quantidade;
    private Exercicio exercicio;
    
    @Override
    public SerieFactory reset() {
        this.numeroRepeticoes = 0;
        this.quantidade = 0;
        this.exercicio = null;
        return this;
    }

    @Override
    public SerieFactory setNumeroRepeticoes(int repeticoes) {
        this.numeroRepeticoes = repeticoes;
        return this;
    }

    @Override
    public SerieFactory setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    @Override
    public Serie build() {
        return new Serie(this.numeroRepeticoes, this.quantidade, this.exercicio);
    }

    @Override
    public SerieFactory setExercicio(Exercicio exercicio) {
        this.exercicio = exercicio;
        return this;
    }
    
}
