package pc2.lab.aula09.model;

public class Losangulo extends FiguraGeometrica{

    private int tamanhoDmaior, tamanhoDmenor;

    public Losangulo(){
        this(1,1);
    }
    public Losangulo(int tamanhoDmaior,int tamanhoDmenor){
        this.tamanhoDmaior = tamanhoDmaior;
        this.tamanhoDmenor = tamanhoDmenor;
    }
    public double getArea(){
        return (tamanhoDmaior*tamanhoDmenor)/2;
    }

    public double getPerimetro() {
        int hipotenusa = ((tamanhoDmaior/2)*(tamanhoDmaior/2))+((tamanhoDmenor/2)*(tamanhoDmenor/2));
        return Math.sqrt(hipotenusa)*4;
    }

    @Override
    public String toString() {
        return "Losango -->\nÁrea: " + getArea() + "\nPerímetro: " + getPerimetro() ;
    }
}
