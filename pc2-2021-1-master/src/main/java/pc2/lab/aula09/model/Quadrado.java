package pc2.lab.aula09.model;

public class Quadrado extends FiguraGeometrica{

    private int lado;

    public Quadrado(){
        this(0);
    }
    public Quadrado(int lado){

        this.lado=lado;

    }

    public double getArea(){
        return lado*lado;
    }

    public double getPerimetro(){
        return lado*4;
    }

    @Override
    public String toString() {
        return "Quadrado -->\nÁrea: " + getArea() + "\nPerímetro: " + getPerimetro() ;
    }
}
