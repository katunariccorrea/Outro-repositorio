/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planocartes;

/**
 *
 * @author katunaric
 */
public class Retangulo {
    private Ponto2D ponto1;
    private Ponto2D ponto2;
    
    public Retangulo(Ponto2D ponto1, Ponto2D ponto2){
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
    }

    public Ponto2D getPonto1() {
        return ponto1;
    }

    public void setPonto1(Ponto2D ponto1) {
        this.ponto1 = ponto1;
    }

    public Ponto2D getPonto2() {
        return ponto2;
    }

    public void setPonto2(Ponto2D ponto2) {
        this.ponto2 = ponto2;
    }
    
    public Ponto2D getCentro(){
        double centroX = 0;
        double centroY = 0;
        if (ponto1.equals(ponto2)){
            if (ponto1.getX()>ponto2.getX()){
                centroX = (ponto1.getX() + ponto2.getX())/2;
            }
            else if(ponto1.getX()<ponto2.getX()){
                centroX = (ponto2.getX() + ponto1.getX())/2;
            }
            else if(ponto1.getY()>ponto2.getY()){            }

                centroY = (ponto1.getY() + ponto2.getY())/2;
            }
            else if(ponto1.getY()<ponto2.getY()){
                centroY = (ponto2.getY() + ponto1.getY())/2;
            }
            Ponto2D centro = new Ponto2D(centroX, centroY);
        return centro;
    }

    public double calculaArea(){
            double base = 0;
            double altura = 0;
            if (ponto1.equals(ponto2)){
            if (ponto1.getX()<ponto2.getX()){
                base = (ponto1.getX() - ponto2.getX())*-1;
            }
            else if(ponto1.getX()>ponto2.getX()){
                base = (ponto2.getX() - ponto1.getX())*-1;
            }
            if(ponto1.getY()<ponto2.getY()){            }

                altura = (ponto1.getY() - ponto2.getY())*-1;
            }
            else if(ponto1.getY()>ponto2.getY()){
                altura = (ponto2.getY() - ponto1.getY())*-1;
            }

            return base * altura;
    }
    
    public double calculaPerimetro(){
        double base = 0;
        double altura = 0;
        if (ponto1.equals(ponto2)){
            if (ponto1.getX()>ponto2.getX()){
                base = ponto1.getX() - ponto2.getX();
            }
            else if(ponto1.getX()<ponto2.getX()){
                base = ponto2.getX() - ponto1.getX();
            }
            if(ponto1.getY()>ponto2.getY()){
                altura = ponto1.getY() - ponto2.getY();
                System.out.println("altura0" + altura);
            }
            else if(ponto1.getY()<ponto2.getY()){
                altura = ponto2.getY() - ponto1.getY();
                System.out.println("altura1" + altura);
            }
         
        }
          return (base + altura)*2;
    }
    
    public String toString(){
        
        return "Centro do retângulo: "+ this.getCentro() + "\nÁrea: "+ this.calculaArea() + "\nPerímetro: " + this.calculaPerimetro();
    }
}

