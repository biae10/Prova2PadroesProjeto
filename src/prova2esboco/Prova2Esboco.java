/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco;

import java.util.ArrayList;
import java.util.List;
import prova2esboco.Decorator.ExercicioCombinado;
import prova2esboco.Singleton.Catalogo;
import prova2esboco.builder.ExercicioBuilder;
import prova2esboco.exercicio.Exercicio;
import prova2esboco.exercicio.TipoExercicio;
import prova2esboco.exercicio.TipoGrupoMuscular;
import prova2esboco.equipamentos.Equipamento;
import prova2esboco.equipamentos.Halter;
import prova2esboco.equipamentos.TipoEquipamento;
import prova2esboco.builder.ExercicioFactory;
import prova2esboco.builder.ProgramaBuilder;
import prova2esboco.builder.SerieBuilder;
import prova2esboco.exercicio.Programa;
import prova2esboco.exercicio.Serie;
import prova2esboco.exercicio.TipoPrograma;
import prova2esboco.model.Instrutor;
import prova2esboco.model.Pessoa;

/**
 *
 * @author HAPPY
 */
public class Prova2Esboco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        Catalogo cat = new Catalogo();
        
        Equipamento eq1 = cat.gerarEquipamento(TipoEquipamento.Maquina, "HaltBianca", 25);
        Equipamento eq2 = cat.gerarEquipamento(TipoEquipamento.Acessorio,"Voaodor", 5);

        ExercicioFactory exercicioBuilder = new ExercicioBuilder();
        
        Exercicio barriga = exercicioBuilder.reset()
        .setNome("Treino de Braço!")
        .addGrupoMuscular(TipoGrupoMuscular.Ombros)
        .addGrupoMuscular(TipoGrupoMuscular.Abdominal)
        .addTipo(TipoExercicio.Resistido)
        .addEquipamento(eq2)
        .addGrupoMuscular(TipoGrupoMuscular.Biceps)
        .addEquipamento(eq1)
        .build();
        
        Exercicio perna = exercicioBuilder.reset()
                .addEquipamento(eq2)
                .addGrupoMuscular(TipoGrupoMuscular.Costa)
                .addTipo(TipoExercicio.Cardiovascular)
                .build();
        
        Exercicio Abdominal = exercicioBuilder.reset()
                .addEquipamento(eq2)
                .addGrupoMuscular(TipoGrupoMuscular.Ombros)
                .addGrupoMuscular(TipoGrupoMuscular.Costa)
                .addTipo(TipoExercicio.Cardiovascular)
                .addTipo(TipoExercicio.Resistido)
                .addTipo(TipoExercicio.Cardiovascular)
                .build();
        
        
        List<Equipamento> testeequipamentos = new ArrayList();
        testeequipamentos.add(eq2);
        testeequipamentos.add(eq1);
        
        List<TipoExercicio> testetipos = new ArrayList();
        testetipos.add(TipoExercicio.Resistido);
        testetipos.add(TipoExercicio.Mobilidade);
        
        List<TipoGrupoMuscular> testegrupos = new ArrayList();
        testegrupos.add(TipoGrupoMuscular.Peito);
        testegrupos.add(TipoGrupoMuscular.Biceps);
        List<TipoGrupoMuscular> testegrupos2 = new ArrayList();
        testegrupos2.add(TipoGrupoMuscular.Inferiores);
        testegrupos2.add(TipoGrupoMuscular.Abdominal);
        
        
        ExercicioCombinado pontaFinalTeste = new ExercicioCombinado("Abre e fecha",testetipos,testegrupos,testeequipamentos,barriga);
        ExercicioCombinado teste = new ExercicioCombinado("Polichinelo",testetipos,testegrupos,testeequipamentos, new ExercicioCombinado("Corrida Hop",testetipos,testegrupos2,testeequipamentos,pontaFinalTeste));
        
        System.out.println(teste.getGrupos());
        
 
        try{
            
        }catch(Exception e){
            
        }
        
        
        try{
            
            SerieBuilder serieBuilder = new SerieBuilder();
        
            Serie serie1 = serieBuilder.reset()
                .setExercicio(barriga)
                .setNumeroRepeticoes(3)
                .setQuantidade(1)
                .build();
        
            Serie serie2 = serieBuilder.reset()
                .setExercicio(perna)
                .setNumeroRepeticoes(5)
                .setQuantidade(2)
                .build();
        
            Serie serie3 = serieBuilder.reset()
                .setExercicio(Abdominal)
                .setNumeroRepeticoes(3)
                .setQuantidade(3)
                .build();
            
            ProgramaBuilder programaBuilder = new ProgramaBuilder();
            
            Programa programa = programaBuilder.reset()
                .setTipo(TipoPrograma.Cardio)
                .addSerie(serie1)
                .addSerie(serie2)
                .addSerie(serie3)
                .addSerie(serie3)
                .build();
            
            
            Pessoa instrutor1 = new Instrutor("Bianca");
            Pessoa instrutor2 = new Instrutor("Isello");
            Pessoa instrutor3 = new Instrutor("Tales");
            Pessoa instrutor4 = new Instrutor("Daniel");
            Pessoa instrutor5 = new Instrutor("Vitor");
            
            programa.inscrever(instrutor1);
            programa.inscrever(instrutor2);
            programa.inscrever(instrutor3);
            programa.inscrever(instrutor4);
            programa.inscrever(instrutor5);
            
           //programa.desinscrever(instrutor1);
            
            int iterador = 0;
            
            programa.setTipo(TipoPrograma.Cardio);
            programa.init();
            while(programa.temProximo(iterador)){
                Serie serie = programa.proximaSerie(iterador);
                iterador++;
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        

    }
    
}
    