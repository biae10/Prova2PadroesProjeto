/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.exercicio;

import prova2esboco.Decorator.Exercicio;
import prova2esboco.flyweight.Video;
/**
 *
 * @author HAPPY
 */
public class Serie {
    
    private int numeroRepeticoes;
    private int quantidade;
    private Exercicio exercicio;

    public Serie(int numeroRepeticoes, int quantidade, Exercicio exercicio) {
        this.numeroRepeticoes = numeroRepeticoes;
        this.quantidade = quantidade;
        this.exercicio = exercicio;
    }

    public int getNumeroRepeticoes() {
        return numeroRepeticoes;
    }

    public void setNumeroRepeticoes(int numeroRepeticoes) {
        this.numeroRepeticoes = numeroRepeticoes;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Exercicio getExercicio() {
        return exercicio;
    }

    public void setExercicio(ExercicioSimples exercicio) {
        this.exercicio = exercicio;
    }

    
    public void executar(){
        System.out.println("[VÍDEO '"+this.exercicio.getVideo().getTitulo()+"' DO EXERCÍCIO "+ this.exercicio.getNome()+"] / "+this.numeroRepeticoes+" x "+this.quantidade);
    }
    
}
