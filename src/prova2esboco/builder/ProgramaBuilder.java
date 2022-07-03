/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.builder;

import java.util.ArrayList;
import java.util.List;
import prova2esboco.exercicio.Programa;
import prova2esboco.exercicio.Serie;
import prova2esboco.exercicio.TipoPrograma;
import prova2esboco.strategy.ProgramaStrategy;

/**
 *
 * @author HAPPY
 */
public class ProgramaBuilder implements ProgramaFactory{

    private List<Serie> series;
    private TipoPrograma tipo;
    private ProgramaStrategy strategy;
    
    @Override
    public ProgramaFactory reset() {
        this.series = new ArrayList();
        this.tipo = null;
        return this;
    }

    @Override
    public ProgramaFactory addSerie(Serie serie) {
        this.series.add(serie);
        return this;
    }

    @Override
    public ProgramaFactory setTipo(TipoPrograma tipo) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        ProgramaStrategy strategy = (ProgramaStrategy) Class.forName(tipo.getClassName()).newInstance();
        this.tipo = tipo;
        this.strategy = strategy;
        return this;
    }

    @Override
    public Programa build() {
        return new Programa(this.series, this.tipo, this.strategy);
    }
    
}
