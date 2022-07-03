/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.equipamentos;

/**
 *
 * @author HAPPY
 */
public class Halter extends Equipamento{
    
    private double peso;

    public Halter(double peso, String identificador, int quantidade) {
        super(identificador, quantidade);
        this.peso = peso;
    }
    
    public Halter(){}

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
