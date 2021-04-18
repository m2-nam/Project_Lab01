package src;

public class ContRectangulo {
    int n,numRec,i;
    int aN[]=new int[20];
    Rectangulo aRec[]=new Rectangulo[20];
    double aDist[]=new double[20];
    double aArea[]=new double[20];
    public ContRectangulo(Rectangulo R, double dist, double area, int i){
        this.i=i;
        aRec[i]=R;
        aDist[i]=dist;
        aArea[i]=area;
    }
    public int getN() {
    return n;
    }
    public void setN(int n) {
    this.n = n;
    }
    public String toString(int i) {
        return this.i+"["+aRec[i]+"]"+"["+aDist[i]+"]"+"["+aArea[i]+"]";
    }
}
