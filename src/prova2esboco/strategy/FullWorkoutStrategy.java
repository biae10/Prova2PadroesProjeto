/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.strategy;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import prova2esboco.exercicio.Serie;

/**
 *
 * @author HAPPY
 */
public class FullWorkoutStrategy implements ProgramaStrategy{

    @Override
    public List<Serie> proximaSerie(List<Serie> series) {
        
      LocalDateTime now = LocalDateTime.now();
      //DayOfWeek day = now.getDayOfWeek();
      DayOfWeek day = DayOfWeek.WEDNESDAY;
      List<Serie> seriesDoDia = new ArrayList();
      
      if(day == DayOfWeek.MONDAY || day == DayOfWeek.WEDNESDAY || day == DayOfWeek.FRIDAY){
          for(int i = 0; i < series.size(); i++){  
            seriesDoDia.add(series.get(i));
          }
      }

      return seriesDoDia;
    }
    
}
