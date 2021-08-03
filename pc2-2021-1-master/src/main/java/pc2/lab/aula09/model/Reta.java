package pc2.lab.aula09.model;

public class Reta extends FiguraGeometrica{

    private Ponto pontoInicia;
    private Ponto pontoFinal;
    private int xInicial,xFinal,yInicial,yFinal;
    public Reta() {
        pontoInicia = new Ponto(0,0);
        pontoFinal = new Ponto(0, 1);
    }

    public Reta(int xInicial, int yInicial, int xFinal, int yFinal) {
        this.xInicial = xInicial;
        this.xFinal = xFinal;
        this.yInicial = yInicial;
        this.yFinal = yFinal;
        pontoInicia = new Ponto(xInicial,yInicial);
        pontoFinal = new Ponto(xFinal, yFinal);
    }

    public Reta(Ponto pInicial, Ponto pFinal) {
        this.pontoInicia = pInicial;
        this.pontoFinal = pFinal;
    }

    public Ponto getPontoInicia() {
        return pontoInicia;
    }

    public void setPontoInicia(Ponto pontoInicia) {
        this.pontoInicia = pontoInicia;
    }

    public Ponto getPontoFinal() {
        return pontoFinal;
    }

    public void setPontoFinal(Ponto pontoFinal) {
        this.pontoFinal = pontoFinal;
    }

    public int getxInicial(){
        return xInicial;
    }
    public int getyInicial(){
        return yInicial;
    }
    public int getxFinal(){
        return xFinal;
    }
    public int getyFinal(){
        return yFinal;
    }


    @Override
    public String toString() {
        return "Reta -->\n Coordenadas iniciais (x,y): " + getxInicial() + getyInicial() +
                "\nCoordenadas finais (x,y): " + getxFinal() + getyFinal();
    }
}
