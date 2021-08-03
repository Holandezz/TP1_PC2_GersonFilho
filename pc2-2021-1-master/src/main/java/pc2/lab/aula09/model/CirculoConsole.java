package pc2.lab.aula09.model;

import pc2.lab.aula09.view.BasicConsole;

public class CirculoConsole extends BasicConsole {
    public Circulo askCirculo(){
        showMsg("Insira o valor do raio: ");
        int tamanhoRaio = in.nextInt();
        Circulo circulo = new Circulo(tamanhoRaio);
        return circulo;
    }
}
