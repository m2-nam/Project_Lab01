package src;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangulo aRectangulo[] = new Rectangulo[20];
        Coordenada aCoordenada[] = new Coordenada[50];
        
        int i;
        double x,y;

        Coordenada C1 = new Coordenada(5.8,3.4);
        Coordenada C2 = new Coordenada(1.8,0.4);
        Rectangulo R1 = new Rectangulo(C1, C2);
        Coordenada C3=new Coordenada(9.4,-2.5);
        Coordenada C4=new Coordenada(4.0,4.2);
        Rectangulo R2=new Rectangulo(C3,C4);
        ContRectangulo Ct1=new ContRectangulo(R1,Coordenada.distancia(C1,
        C2),R1.calculoArea(C1, C2),0);

        System.out.println("Cantidad de rectangulos a mostrar?");
        int n = scan.nextInt();
        Ct1.setN(n);
        for (i=0;i<n;i++){
            System.out.print("Esquina 1er rectangulo: ");
            x = scan.nextDouble();
            y = scan.nextDouble();
            System.out.println();
            aCoordenada[i*4]=new Coordenada(x,y);
            
            System.out.print("Esquina opuesta 1er rectangulo: ");
            x = scan.nextDouble();
            y = scan.nextDouble();
            System.out.println();
            aCoordenada[(i*4)+1]=new Coordenada(x,y);
            aCoordenada[(i*2)]=new Rectangulo(aCoordenada[i*4], aCoordenada[(i*4)+1]);
            
            System.out.print("Esquina 2do rectangulo:");
            x = scan.nextDouble();
            y = scan.nextDouble();
            System.out.println();
            aCoordenada[(i*4)+2]=new Coordenada(x,y);
            
            System.out.print("Esquina opuesta 2do rectangulo:");
            x = scan.nextDouble();
            y = scan.nextDouble();
            System.out.println();
            aCoordenada[(i*4)+3]=new Coordenada(x,y);
            aCoordenada[(i*2)+1]=new Rectangulo(aCoordenada[(i*4)+2], aCoordenada[(i*4)+3]);
            
            System.out.println("Rectangulo A="+aRectangulo[i*2].toString());
            System.out.println("Rectangulo B="+aRectangulo[(i*2)+1].toString());
            Verificador V1=new Verificador(aRectangulo[i*2],aRectangulo[(i*2)+1]);
            V1.Verific(aRectangulo[i*2], aRectangulo[(i*2)+1]);
        }
    }
}
