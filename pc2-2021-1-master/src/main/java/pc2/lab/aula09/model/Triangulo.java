package pc2.lab.aula09.model;

/**
 * A classe triângulo é usada para criar triângulos com os dados inseridos pelo usuário, nela é realizado o cálculo da área e do perímetro do triângulo.
 *
 *
 *
 */
public class Triangulo extends FiguraGeometrica{

    private int lado1,lado2,lado3;
    private double perimetro,area;


    public Triangulo(){
        this(1,1,1);
    }
    public Triangulo(int lado1,int lado2,int lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        getPerimetro();
        getArea();
    }

    public double getPerimetro() {
        perimetro = lado1+lado2+lado3;
        return perimetro;
    }

    public double getArea() {
        double semiperimetro = perimetro / 2;
        //System.out.println(semiperimetro);
        area = Math.sqrt(semiperimetro * ((semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3)));
        //System.out.println(area);
        return area;
    }


    @Override
    public String toString() {
        return "Triângulo -->\nÁrea: " + area + "\nPerímetro: " + perimetro ;
    }
}

