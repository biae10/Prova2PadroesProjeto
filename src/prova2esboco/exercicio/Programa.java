/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.exercicio;

import java.util.List;
import prova2esboco.strategy.ABCDStrategy;
import prova2esboco.strategy.CardioStrategy;
import prova2esboco.strategy.FullWorkoutStrategy;

/**
 *
 * @author HAPPY
 */
public class Programa {
    
    private List<Serie> series;
    List<Serie> listStrategy;
    private TipoPrograma tipo;

    public Programa(List<Serie> series, TipoPrograma tipo) {
        this.series = series;
        this.tipo = tipo;
    }
    
    public Programa(){}
    
    public void init() throws Exception{
       
        if(this.tipo == TipoPrograma.FullWorkout){
            FullWorkoutStrategy fws = new FullWorkoutStrategy();
            this.listStrategy = fws.proximaSerie(series);
        }else if(this.tipo == TipoPrograma.ABCD){
            ABCDStrategy abcdS = new ABCDStrategy();
            this.listStrategy = abcdS.proximaSerie(series);
        }else if(this.tipo == TipoPrograma.Cardio){
            CardioStrategy cs = new CardioStrategy();
            this.listStrategy = cs.proximaSerie(series);
        }else{
            throw new Exception("O tipo informado é invalido.");
        }
    }
    
    public boolean temProximo(int iterador){
        
        if(iterador >= this.listStrategy.size()){
            return false;
        }
        return true;
    }
    
    public Serie proximaSerie(int iterador) throws Exception{

        return this.listStrategy.get(iterador);
    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }

    public TipoPrograma getTipo() {
        return tipo;
    }

    public void setTipo(TipoPrograma tipo) {
        this.tipo = tipo;
    }

    public List<Serie> getListStrategy() {
        return listStrategy;
    }
}
