/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planocartes;

import java.lang.Math;

/**
 *
 * @author katunaric
 */
public class Circulo {
    private Ponto2D centro;
    private double raio;
    
    public Circulo (Ponto2D centro, double raio){
        this.centro = centro;
        this.raio = raio;
    }

    public Ponto2D getCentro() {
        return centro;
    }

    public void setCentro(Ponto2D centro) {
        this.centro = centro;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double calculaArea(){
        return Math.PI * (this.getRaio() * this.getRaio());
                
    }
    
    public double calculaPerimetro(){
        return 2 * Math.PI * this.getRaio();
    }
    
    public double amplia(double fator){
        return this.getRaio() * fator;   
    }
    
    public double reduz(double fator){
        return this.getRaio() / fator;
    }
    
    public String toString(){
        return "Circulo: Centro : "+ this.getCentro() + " | Raio: " + this.getRaio() + " | Área: " + this.calculaArea() + " | Perímetro: " + this.calculaPerimetro() + "\nO raio foi ampliado " + this.amplia(raio) + "\nO raio foi reduzido "+ this.reduz(raio);
    }
    
    
}

