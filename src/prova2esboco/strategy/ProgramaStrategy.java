/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.strategy;

import java.util.List;
import prova2esboco.exercicio.Serie;

/**
 *
 * @author HAPPY
 */
public interface ProgramaStrategy {
    
    public List<Serie> proximaSerie(List<Serie> series);
    
}
