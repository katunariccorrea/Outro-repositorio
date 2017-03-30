package planocartes;

import java.lang.Math;

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

