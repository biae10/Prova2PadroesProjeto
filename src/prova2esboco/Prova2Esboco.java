/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco;

import java.util.ArrayList;
import java.util.List;
import prova2esboco.Decorator.Exercicio;
import prova2esboco.Decorator.ExercicioCombinado;
import prova2esboco.Singleton.Catalogo;
import prova2esboco.builder.ExercicioBuilder;
import prova2esboco.builder.ExercicioCombinadoBuilder;
import prova2esboco.exercicio.ExercicioSimples;
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
import prova2esboco.flyweight.Video;
import prova2esboco.flyweight.VideoFactory;
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
        VideoFactory vf = new VideoFactory();
        
        //Equipamentos instância
        Equipamento esteira=null, bicicleta=null,halter=null,halter2=null,barraFixa=null,teste=null;
        
        //Instância dos equipamentos
        try{
            esteira = cat.gerarEquipamento(TipoEquipamento.Maquina, "Esteira", 10);
        }catch(Exception e){
            throw e;
        }
       
        try{
            bicicleta = cat.gerarEquipamento(TipoEquipamento.Maquina, "Bicicleta", 5);
        }catch(Exception e){
            throw e;
        }
        
        try{
            halter = cat.gerarEquipamento(TipoEquipamento.Halter, "Halter", 3);
        }catch(Exception e){
            throw e;
        }
        
        try{
            barraFixa = cat.gerarEquipamento(TipoEquipamento.Acessorio, "BarraFixa", 7);
        }catch(Exception e){
            throw e;
        }
        
        try{
            halter2 = cat.gerarEquipamento(TipoEquipamento.Halter, "Halter", 10);
        }catch(Exception e){
            throw e;
        }

        //Teste de impressão dos equipamentos
        System.out.println("----------------Equipamentos Gerados----------------");
        System.out.println(esteira.getIdentificador());
        System.out.println(bicicleta.getIdentificador());
        System.out.println(halter.getIdentificador());
        System.out.println(barraFixa.getIdentificador());
        System.out.println(halter2.getIdentificador());
        System.out.println("----------------------------------------------------");
        System.out.println();
        
        // Declaração dos exercicios simples
        ExercicioFactory exercicioBuilder = new ExercicioBuilder();
        Exercicio corridaAerobica=null,corridaErgometrica=null, subidaEmBarra=null, 
                levantamentoPeso=null, levantamentoPeso2kg=null;

        //Instância exercicios
        try{
           corridaAerobica = exercicioBuilder.reset()
                .setNome("Corrida Aerobica")
                .addEquipamento(esteira)
                .addGrupoMuscular(TipoGrupoMuscular.Triceps)
                .addGrupoMuscular(TipoGrupoMuscular.Inferiores)
                .addTipo(TipoExercicio.Cardiovascular)
                .addTipo(TipoExercicio.Funcional)
                .setVideo(vf.getVideo("Execução de Corrida Aerobica", "CONTEUDO"))
                .build(); 
        }catch(Exception e){
            throw e;
        }
        
        try{
            corridaErgometrica = exercicioBuilder.reset()
                .setNome("Corrida ergonmetrica")
                .addEquipamento(bicicleta)
                .addGrupoMuscular(TipoGrupoMuscular.Inferiores)
                .addTipo(TipoExercicio.Resistido)
                .addTipo(TipoExercicio.Mobilidade)
                .setVideo(vf.getVideo("Execução de corrida ergometrica", "CONTEUDO"))
                .build();
        }catch(Exception e){
            throw e;
        }

        try{
            subidaEmBarra = exercicioBuilder.reset()
                    .setNome("Subida em Barra Fixa")
                    .addEquipamento(barraFixa)
                    .addGrupoMuscular(TipoGrupoMuscular.Ombros)
                    .addGrupoMuscular(TipoGrupoMuscular.Peito)
                    .addGrupoMuscular(TipoGrupoMuscular.Costa)
                    .addGrupoMuscular(TipoGrupoMuscular.Biceps)
                    .addTipo(TipoExercicio.Funcional)
                    .setVideo(vf.getVideo("Execução barra fixa", "CONTEUDO"))
                    .build();          
        }catch(Exception e){
            throw e;
        }
        
        try{
            levantamentoPeso = exercicioBuilder.reset()
                    .setNome("Levantamento de Peso")
                    .addEquipamento(halter)
                    .addGrupoMuscular(TipoGrupoMuscular.Triceps)
                    .addGrupoMuscular(TipoGrupoMuscular.Biceps)
                    .addTipo(TipoExercicio.Resistido)
                    .setVideo(vf.getVideo("Execução Levantamento de Peso", "CONTEUDO"))
                    .build();
        }catch(Exception e){
            throw e;
        }
        
        try{
            levantamentoPeso2kg = exercicioBuilder.reset()
                    .setNome("Levantamento de Peso 2KG")
                    .addEquipamento(halter)
                    .addGrupoMuscular(TipoGrupoMuscular.Triceps)
                    .addGrupoMuscular(TipoGrupoMuscular.Biceps)
                    .addTipo(TipoExercicio.Resistido)
                    .setVideo(vf.getVideo("Execução Levantamento de Peso", "CONTEUDO"))
                    .build();
        }catch(Exception e){
            throw e;
        }
        
        //Instância exercicios combinados
        ExercicioCombinadoBuilder combinadoBuilder = new  ExercicioCombinadoBuilder();
        Exercicio corridaEBarra=null,pesoCorridaBarra = null;
        
        try{
            corridaEBarra = combinadoBuilder.reset()
                    .setNome("Corrida com Barra")
                    .addEquipamento(bicicleta)
                    .addEquipamento(esteira)
                    .addGrupoMuscular(TipoGrupoMuscular.Inferiores)
                    .addGrupoMuscular(TipoGrupoMuscular.Biceps)
                    .addTipo(TipoExercicio.Resistido)
                    .addTipo(TipoExercicio.Mobilidade)
                    .setVideo(vf.getVideo("Execução de corrida + Subida em barra", "CONTEUDO"))
                    .withExercicio(subidaEmBarra)
                    .build();
        }catch(Exception e){
            
        }
        
        try{
            pesoCorridaBarra = combinadoBuilder.reset()
                    .setNome("Corrida, peso e barra")
                    .addEquipamento(bicicleta)
                    .addEquipamento(halter)
                    .addEquipamento(barraFixa)
                    .addGrupoMuscular(TipoGrupoMuscular.Biceps)
                    .addGrupoMuscular(TipoGrupoMuscular.Inferiores)
                    .addGrupoMuscular(TipoGrupoMuscular.Peito)
                    .addTipo(TipoExercicio.Funcional)
                    .setVideo(vf.getVideo("Execução de corrida + Subida em barra + levantamento de peso", "CONTEUDO"))
                    .withExercicio(corridaEBarra)
                    .build();
        }catch(Exception e){
            throw e;
        }
        
        //Exibição dos exercícios
        System.out.println("----------------Exercícios Gerados----------------");
        
        System.out.println(corridaAerobica.getNome());
        System.out.println(corridaErgometrica.getNome());
        System.out.println(subidaEmBarra.getNome());
        System.out.println(levantamentoPeso.getNome());
        System.out.println(levantamentoPeso2kg.getNome());
        
        System.out.println("--------------------------------------------------------------");
        System.out.println();
        
        System.out.println("----------------Info dos exercícios Combinados----------------");
        System.out.println("Grupos Musculares do exercicio "+pesoCorridaBarra.getNome()+":"+pesoCorridaBarra.getGrupos());
        System.out.println("Tipos do exercicio "+pesoCorridaBarra.getNome()+":"+pesoCorridaBarra.getTipos());
        System.out.println("--------------------------------------------------------------");
        System.out.println();
        
        //Instância das séries
        SerieBuilder serieBuilder = new SerieBuilder();
        Serie serieCardio=null, serieBracosRedondos=null, serieForca=null, serieCorrida=null,serieForcaECardio=null;
        
        //Definição das séries
        try{
            serieCardio = serieBuilder.reset()
                    .setExercicio(corridaAerobica)
                    .setNumeroRepeticoes(5)
                    .setQuantidade(2)
                    .build();
        }catch(Exception e){
            throw e;
        }
        
        try{
            serieBracosRedondos = serieBuilder.reset()
                    .setExercicio(subidaEmBarra)
                    .setNumeroRepeticoes(3)
                    .setQuantidade(3)
                    .build();
        }catch(Exception e){
            throw e;
        }
        
        try{
            serieForca = serieBuilder.reset()
                    .setExercicio(levantamentoPeso2kg)
                    .setNumeroRepeticoes(10)
                    .setQuantidade(5)
                    .build();
        }catch(Exception e){
            throw e;
        }
        
        try{
            serieCorrida = serieBuilder.reset()
                    .setExercicio(corridaErgometrica)
                    .setNumeroRepeticoes(1)
                    .setQuantidade(1)
                    .build();
        }catch(Exception e){
            throw e;
        }
        
        try{
            serieForcaECardio = serieBuilder.reset()
                    .setExercicio(corridaEBarra)
                    .setNumeroRepeticoes(15)
                    .setQuantidade(1)
                    .build();
        }catch(Exception e){
           throw e; 
        }
        
        //Instância do programa
        ProgramaBuilder programaBuilder = new ProgramaBuilder();
        Programa programa;
        int iterador = 0;
        
        try{
            programa = programaBuilder.reset()
                    .setTipo(TipoPrograma.Cardio)
                    .addSerie(serieCardio)
                    .addSerie(serieBracosRedondos)
                    .addSerie(serieForca)
                    .addSerie(serieCorrida)
                    .addSerie(serieForcaECardio)
                    .build();
        }catch(Exception e){
            throw e;
        }
        
        
        
        //Definição dos Intrutores que ficaram de ouvinte na execução do programa
        Pessoa instrutor1 = new Instrutor("Bianca");
        Pessoa instrutor2 = new Instrutor("Cristiano");
        Pessoa instrutor3 = new Instrutor("Messi");
        Pessoa instrutor4 = new Instrutor("Neymar");
        Pessoa instrutor5 = new Instrutor("Fred");
        
        //Inscrevendo os instrutores no listener do programa
        programa.inscrever(instrutor1);
        programa.inscrever(instrutor2);
        programa.inscrever(instrutor3);
        programa.inscrever(instrutor4);
        programa.inscrever(instrutor5);
        
        //Desinscrevendo um instrutor da lista de ouvintes
        programa.desinscrever(instrutor2);
        
        
        System.out.println("----------------Execução do Programa (Séries do dia atual)----------------");
        programa.setTipo(TipoPrograma.FullWorkout);
        programa.init();
        while(programa.temProximo(iterador)){
            Serie serie = programa.proximaSerie(iterador);
            serie.executar();
            System.out.println();
            iterador++;
        }
        
        

    }
    
}
    