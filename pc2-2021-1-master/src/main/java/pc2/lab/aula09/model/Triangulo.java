package pc2.lab.aula09.model;

public class Triangulo extends FiguraGeometrica{

    private int lado1,lado2,lado3;

    public Triangulo(){
        this(1,1,1);
    }
    public Triangulo(int lado1,int lado2,int lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public double getArea(){
        double semiperimetro = getPerimetro()/2;
        return Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));
    }

    public double getPerimetro() {
        return lado1+lado2+lado3;
    }

    @Override
    public String toString() {
        return "Losango -->\nÁrea: " + getArea() + "\nPerímetro: " + getPerimetro() ;
    }
}

}
