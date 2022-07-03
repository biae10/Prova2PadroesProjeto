/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.builder;

import prova2esboco.exercicio.Programa;
import prova2esboco.exercicio.Serie;
import prova2esboco.exercicio.TipoPrograma;

/**
 *
 * @author HAPPY
 */
public interface ProgramaFactory {
    
    public ProgramaFactory reset();
    public ProgramaFactory addSerie(Serie serie);
    public ProgramaFactory setTipo(TipoPrograma tipo);
    public Programa build();
}
