package src;

import java.util.*;
public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(Coordenada c1, Coordenada c2){
        setEsquina1(c1);
        setEsquina2(c2);
    }
    void setR(Rectangulo R1) {
        this.R1=R1;
        }
    public void setEsquina1 (Coordenada coo){
        this.esquina1 = coo;
    }
    public void setEsquina2 (Coordenada coo){
        this.esquina2 = coo;
    }
    public Coordenada getEsquina1(){
        return this.esquina1;
    }
    public Coordenada getEsquina2(){
        return this.esquina2;
    }
    public double calArea(Coordenada c1, Coordenada c2) {
        double area, y, x;
        y=0;
        x=c1.getX()-c2.getX();
        x=c1.getY()-c2.getY();
        if (x<0) {
            x=x*-1;
        }
        if (y<0) {
            y=y*-1;
        }
        area=x*y;
        return area;
    }
    public String toString() {
        return "("+ this.esquina1 + ", " + this.esquina2 + ")";
    }
}
