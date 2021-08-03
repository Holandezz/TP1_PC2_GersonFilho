package pc2.lab.aula09.model;


import pc2.lab.aula09.view.BasicConsole;

public class QuadradoConsole extends BasicConsole {

    public Quadrado askQuadrado(){
        showMsg("Digite o tamanho do lado do quadrado: ");
        int tamanho  = in.nextInt();
        Quadrado quad = new Quadrado(tamanho);

        return quad;
    }
}
