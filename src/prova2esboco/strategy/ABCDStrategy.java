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
import prova2esboco.exercicio.Serie;
import prova2esboco.exercicio.TipoExercicio;
import prova2esboco.exercicio.TipoGrupoMuscular;

/**
 *
 * @author HAPPY
 */
public class ABCDStrategy implements ProgramaStrategy{
    
    
    @Override
    public List<Serie> proximaSerie(List<Serie> series) {
        
       LocalDateTime now = LocalDateTime.now();
      //DayOfWeek day = now.getDayOfWeek();
      DayOfWeek day = DayOfWeek.THURSDAY;
      List<Serie> seriesDoDia = new ArrayList();
      
        if(day == DayOfWeek.MONDAY || day == DayOfWeek.TUESDAY || day == DayOfWeek.WEDNESDAY || day == DayOfWeek.THURSDAY){
          
            for(int i = 0; i < series.size(); i++){
                List<TipoGrupoMuscular> gruposMusculares = series.get(i).getExercicio().getGrupos();
                for(int j = 0; j < gruposMusculares.size(); j++){
                    if((gruposMusculares.get(j) == TipoGrupoMuscular.Ombros ||gruposMusculares.get(j) == TipoGrupoMuscular.Abdominal) && day == DayOfWeek.MONDAY){
                        seriesDoDia.add(series.get(i));
                        break;
                    }else if((gruposMusculares.get(j) == TipoGrupoMuscular.Inferiores) && day == DayOfWeek.TUESDAY){
                        seriesDoDia.add(series.get(i));
                        break;
                    }else if((gruposMusculares.get(j) == TipoGrupoMuscular.Peito ||gruposMusculares.get(j) == TipoGrupoMuscular.Triceps) && day == DayOfWeek.WEDNESDAY){
                        seriesDoDia.add(series.get(i));
                        break;
                    }else if((gruposMusculares.get(j) == TipoGrupoMuscular.Costa ||gruposMusculares.get(j) == TipoGrupoMuscular.Biceps) && day == DayOfWeek.THURSDAY){
                        seriesDoDia.add(series.get(i));
                        break;
                    }   
                }       
            }
        }
        return seriesDoDia;
    }  
}
