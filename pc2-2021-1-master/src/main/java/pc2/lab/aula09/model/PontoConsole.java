package pc2.lab.aula09.model;

import pc2.lab.aula09.view.BasicConsole;

public class PontoConsole extends BasicConsole {
    public Ponto askPonto(){
        showMsg("Insira as coordenadas X e Y: ");
        int lado1 = in.nextInt();
        int lado2 = in.nextInt();
        Ponto ponto = new Ponto(lado1,lado2);
        return ponto;
    }
}

