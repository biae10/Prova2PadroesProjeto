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
    private TipoPrograma tipo;

    public Programa(List<Serie> series, TipoPrograma tipo) {
        this.series = series;
        this.tipo = tipo;
    }
    
    public Programa(){}
    
    public List<Serie> proximaSerie() throws Exception{
        
        List<Serie> seriesDoPrograma;
        
        
        if(this.tipo == TipoPrograma.FullWorkout){
            FullWorkoutStrategy fws = new FullWorkoutStrategy();
            seriesDoPrograma = fws.proximaSerie(series);
        }else if(this.tipo == TipoPrograma.ABCD){
            ABCDStrategy abcdS = new ABCDStrategy();
            seriesDoPrograma = abcdS.proximaSerie(series);
        }else if(this.tipo == TipoPrograma.Cardio){
            CardioStrategy cs = new CardioStrategy();
            seriesDoPrograma = cs.proximaSerie(series);
        }else{
            throw new Exception("O tipo informado é invalido.");
        }
        return seriesDoPrograma;
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
    
}
