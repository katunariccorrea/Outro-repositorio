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
public class Ponto2D {
    private double x;
    private double y;
    
    public Ponto2D(double x, double y){
        if ((x>1000) || (y>1000)){
            System.out.println("Ponto fora do plano cartesiano!!!");
            System.out.println("Os pontos devem ficar entre 0 e 1000");
        }else{
        this.x = x;
        this.y = y;
        }
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public boolean equals(Ponto2D ponto){
        if ((this.x == ponto.getX()) || (this.y == ponto.getY())){
            System.out.println("Os pontos são iguais!");
            return false;
        }else{
          //  System.out.println("os pontos são diferentes!");
            return true;
        }
    }
    
    public String toString(){
        
        return "Ponto2D: X = " + this.x + " | Y: " + this.y + ".";
    }
    
}

