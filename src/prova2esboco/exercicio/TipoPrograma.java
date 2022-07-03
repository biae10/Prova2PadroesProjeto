/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.exercicio;

/**
 *
 * @author HAPPY
 */
public enum TipoPrograma {
    FullWorkout("prova2esboco.strategy.FullWorkoutStrategy"), 
    ABCD("prova2esboco.strategy.ABCDStrategy"),
    Cardio("prova2esboco.strategy.CardioStrategy");
    
    String className;
    
    TipoPrograma(String nome){
        this.className = nome;
    }
    
    public String getClassName(){
        return this.className;
    }
}
