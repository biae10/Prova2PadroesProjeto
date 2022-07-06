/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.builder;

import prova2esboco.exercicio.ExercicioSimples;
import prova2esboco.exercicio.Serie;
import prova2esboco.flyweight.Video;
import prova2esboco.flyweight.VideoFactory;

/**
 *
 * @author HAPPY
 */
public class SerieBuilder implements SerieFactory{
    
    private int numeroRepeticoes;
    private int quantidade;
    private ExercicioSimples exercicio;
    private Video video;
    
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
    public SerieFactory setExercicio(ExercicioSimples exercicio) {
        this.exercicio = exercicio;
        return this;
    }

    @Override
    public Serie build() {
        return new Serie(this.numeroRepeticoes, this.quantidade, this.exercicio);
    }
}
