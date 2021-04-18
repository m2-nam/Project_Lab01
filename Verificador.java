package src;

public class Verificador {
    private Rectangulo R1;
    private Rectangulo R2;
    private Verificador V1;
    public Verificador(Rectangulo R1, Rectangulo R2) {
    setR1(R1);
    setR2(R2);
    }
    public void setR1 (Rectangulo R1) {
        this.R1=R1;
    }
    public void setR2 (Rectangulo R2) {
        this.R2=R2;
    }
    public String Verific(Rectangulo R1, Rectangulo R2) {
        int i,j;
        double array[]=new double[4];
        Rectangulo auxR;
        Coordenada Esq1,Esq2,Esq3,Esq4;
        double x1, x2, x3, x4, y1, y2, y3, y4, aux;
        Esq1=R1.getEsquina1();
        x1=Esq1.getX();
        y1=Esq1.getY();
        Esq2=R1.getEsquina2();
        x2=Esq2.getX();
        y2=Esq2.getY();
        Esq3=R2.getEsquina1();
        x3=Esq3.getX();
        y3=Esq3.getY();
        Esq4=R2.getEsquina2();
        x4=Esq4.getX();
        y4=Esq4.getY();
        x4=aux;
        
        if (x2<x3||y2<y3){
            System.out.print("Rectangulos A y B son disjuntos");
        }
        else if(x2==x3||y2==y3){
        System.out.print("Rectangulos A y B se juntan");
        }
        else{
            array[0]=x1;
            array[1]=x2;
            array[2]=x3;
            array[3]=x4;
            for(i=0;i<array.length-1;i++){
                for(j=0;j<array.length-i-1;j++){
                    if(array[j+1]<array[j]){
                        aux=array[j+1];
                        array[j+1]=array[j];
                        array[j]=aux;
                    }
                }
            }
            x1=array[1];
            x2=array[2];
            array[0]=y1;
            array[1]=y2;
            array[2]=y3;
            array[3]=y4;
            for(i=0;i<array.length-1;i++){
                for(j=0;j<array.length-i-1;j++){
                    if(array[j+1]<array[j]){
                        aux=array[j+1];
                        array[j+1]=array[j];
                        array[j]=aux;
                    }
                }
            }
            y1=array[1];
            y2=array[2];
            Esq1.setX(x1);
            Esq1.setY(y1);
            Esq2.setX(x2);
            Esq2.setY(y2);
            R1.setEsquina1(Esq1);
            R1.setEsquina2(Esq2);
            if (R1.calArea(Esq1, Esq2)==0)
            {
            System.out.print("Rectangulos A y B se juntan");
            }
            else{
                System.out.print("Rectangulos A y B se sobreponen");
                System.out.print("El Area es: "+ R1.calArea(Esq1, Esq2)+"");
            }
        }
        return "error";
    }
}
