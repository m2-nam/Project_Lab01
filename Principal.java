package src;

public class Principal {
    public static void main(String[] args) {
        Coordenada p1;
        p1 = new Coordenada();

        Coordenada p2 = new Coordenada(20,30);

        /*System.out.println(p1);
        p2.setX(5);
        System.out.println(p2);

        System.out.println(p2.distancia(p1));
        System.out.println(Coordenada.distancia(p1, p2));*/
        Rectangulo  r1 = new Rectangulo(p1,p2);
        Rectangulo r2 = new Rectangulo (new Coordenada(-5,10), new Coordenada(3.2, -7));

        System.out.println("Rectangulo r1 = "+r1);
        System.out.println("Rectangulo r2 = "+r2);
    }
}
