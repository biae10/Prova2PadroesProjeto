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
public class VideoFlyweight extends Video{

    public VideoFlyweight(String titulo, String conteudo) {
        super(titulo, conteudo);
    }

    @Override
    public void play() {
        System.out.println("[VIDEO DO EXERCICIO "+this.titulo+"]");
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }
    
}
