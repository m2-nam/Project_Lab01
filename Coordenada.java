package src;

import java.util.*;
public class Coordenada{
    private double x;
    private double y;
    public Coordenada(){
        this(0,0);
    }
    public Coordenada(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Coordenada(Coordenada c){
        this.x = c.x;
        this.y = c.y;
    }
    public void setX(double x){
        this.x =x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return y;
    }
    public double distancia(Coordenada c){
        double difX = c.x - this.x;
        double difY = c.y - this.y;

        return Math.sqrt(Math.pow(difX, 2) + Math.pow(difY, 2));
    }
    public static double distancia(Coordenada c1, Coordenada c2){
        double difX = c2.x - c1.x;
        double difY = c2.y - c1.y;

        return Math.sqrt(Math.pow(difX, 2) + Math.pow(difY, 2));
    }
    @override
    public
    String toString(){
        return "(" + x + ", " + y + ")";
    }
}