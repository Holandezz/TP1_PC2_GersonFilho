package pc2.lab.aula09.model;

public class Retangulo extends Quadrilatero{

    private int altura, base;

    public Retangulo(){
        this(0,0);
    }
    public Retangulo(int altura, int base){

        this.altura=altura;
        this.base=base;

    }
    public double getArea(){
        return altura*base;
    }

    public double getPerimetro() {
        return (altura*2)+(base*2);
    }

    @Override
    public String toString() {
        return "Retângulo -->\nÁrea: " + getArea() + "\nPerímetro: " + getPerimetro() ;
    }
}
