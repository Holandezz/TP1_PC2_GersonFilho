package pc2.lab.aula09.model;

import pc2.lab.aula09.view.BasicConsole;

public class RetanguloConsole extends BasicConsole {
    public Retangulo askRetangulo(){
        showMsg("Digite a base do retângulo: ");
        int base  = in.nextInt();
        showMsg("Digite a altura do retângulo: ");
        int altura  = in.nextInt();
        Retangulo retangulo = new Retangulo(base,altura);
        return retangulo;
    }
}
