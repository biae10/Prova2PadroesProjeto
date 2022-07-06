/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.model;

import java.time.LocalDateTime;
import prova2esboco.exercicio.TipoPrograma;
import prova2esboco.listener.Listener;

/**
 *
 * @author HAPPY
 */
public class Pessoa implements Listener{
    
    protected String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }
    
    @Override
    public void update(TipoPrograma tipo) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Olá, "+this.nome+"! O programa do tipo "+ tipo.toString() +" foi finalizado em: "+now);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
}
