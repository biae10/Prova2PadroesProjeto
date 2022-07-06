/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.exercicio;

import prova2esboco.flyweight.Video;
/**
 *
 * @author HAPPY
 */
public class Serie {
    
    private int numeroRepeticoes;
    private int quantidade;
    private ExercicioSimples exercicio;

    public Serie(int numeroRepeticoes, int quantidade, ExercicioSimples exercicio) {
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

    public ExercicioSimples getExercicio() {
        return exercicio;
    }

    public void setExercicio(ExercicioSimples exercicio) {
        this.exercicio = exercicio;
    }

    
    public void executar(){
        System.out.println("O exercício '" + this.exercicio.getNome() + "' deve ser executado " + this.numeroRepeticoes +" vezes. A quantidade do exercício é "+ this.quantidade);
        this.exercicio.getVideo().play();
    }
    
}
