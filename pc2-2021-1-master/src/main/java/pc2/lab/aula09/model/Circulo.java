package pc2.lab.aula09.model;

public class Circulo extends FiguraGeometrica{

        private int tamanhoRaio;
        public Circulo(){
            this.tamanhoRaio = 1;
        }

        public Circulo(int tamanhoRaio){
            this.tamanhoRaio = tamanhoRaio;
        }
        public int getRaio(){

            return this.tamanhoRaio;
        }

        public double getArea(){
            return Math.PI*(tamanhoRaio*tamanhoRaio);
        }

        public double getPerimetro() {
            return (2*Math.PI * tamanhoRaio);
        }

        @Override
        public String toString() {
            return "Circulo -->\nÁrea: " + getArea() + "\nPerímetro: " + getPerimetro() ;
        }
    }

