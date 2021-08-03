package pc2.lab.aula09.model.enums;

import pc2.lab.aula09.model.Ponto;
import pc2.lab.aula09.view.BasicConsole;
import pc2.lab.aula09.model.Reta;
public class RetaConsole extends BasicConsole {

    public Reta askReta() {
        showMsg("Insira as coordenadas X e Y iniciais: ");
        int lado1 = in.nextInt();
        int lado2 = in.nextInt();
        Ponto ponto = new Ponto(lado1,lado2);
        showMsg("Insira as coordenadas X e Y finais: ");
        int lado3 = in.nextInt();
        int lado4 = in.nextInt();
        Ponto pontoF = new Ponto(lado3,lado4);
        Reta reta = new Reta(ponto,pontoF);
        return reta;

    }
}