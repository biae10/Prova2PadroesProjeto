/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.listener;

import java.util.List;

/**
 *
 * @author HAPPY
 */
public interface Subject {
    
    public void inscrever(Listener observer);
    public void desinscrever(Listener observer);
    public void notificar();
    
}
