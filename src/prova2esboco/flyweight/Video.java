/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.flyweight;

/**
 *
 * @author HAPPY
 */
public abstract class Video {
    
    protected String titulo;
    protected String conteudo;

    public Video(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }
 
    public abstract void play();
    public abstract String getTitulo();
}
