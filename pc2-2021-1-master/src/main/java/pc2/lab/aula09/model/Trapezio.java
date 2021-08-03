package pc2.lab.aula09.model;

public class Trapezio extends FiguraGeometrica {
    private int baseMaior,baseMenor,altura;

    public Trapezio () {
        this(2,1,3);
    }
    public Trapezio (int baseMaior,int baseMenor,int altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }
    public double getArea(){
        return ((baseMenor+baseMaior)*altura)/2;
    }

    public double getPerimetro() {
        double cateto = (baseMaior - baseMenor)/2;
        double hipotenusa = (cateto*cateto) + (altura*altura);
        return (baseMaior+baseMenor+(Math.sqrt(hipotenusa)*2));
    }

    @Override
    public String toString() {
        return "Trapézio -->\nÁrea: " + getArea() + "\nPerímetro: " + getPerimetro() ;
    }
}
