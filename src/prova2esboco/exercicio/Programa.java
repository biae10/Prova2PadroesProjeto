/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.exercicio;

import java.util.ArrayList;
import java.util.List;
import prova2esboco.listener.Listener;
import prova2esboco.listener.Subject;
import prova2esboco.strategy.ABCDStrategy;
import prova2esboco.strategy.CardioStrategy;
import prova2esboco.strategy.FullWorkoutStrategy;
import prova2esboco.strategy.ProgramaStrategy;

/**
 *
 * @author HAPPY
 */
public class Programa implements Subject{
    
    private List<Serie> series;
    private List<Serie> listStrategy;
    private ProgramaStrategy strategy;
    private TipoPrograma tipo;
    private List<Listener> listeners = new ArrayList();

    public Programa(List<Serie> series, TipoPrograma tipo,ProgramaStrategy strategy) {
        this.series = series;
        this.tipo = tipo;
        this.strategy = strategy;
    }
    
    public Programa(){}
    
    public void init() throws Exception{
        this.listStrategy = this.strategy.proximaSerie(series);  
    }
    
    public boolean temProximo(int iterador){
        if(iterador >= this.listStrategy.size()){
            this.notificar();
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

    public void setTipo(TipoPrograma tipo) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        ProgramaStrategy strategy = (ProgramaStrategy) Class.forName(tipo.getClassName()).newInstance();
        this.tipo = tipo;
        this.strategy = strategy;
    }

    public List<Serie> getListStrategy() {
        return listStrategy;
    }

    @Override
    public void inscrever(Listener observer) {
        this.listeners.add(observer);
    }

    @Override
    public void desinscrever(Listener observer) {
        this.listeners.remove(observer);
    }

    @Override
    public void notificar() {
        for(Listener listener: this.listeners){
            listener.update(this.tipo);
        }
    }
}
