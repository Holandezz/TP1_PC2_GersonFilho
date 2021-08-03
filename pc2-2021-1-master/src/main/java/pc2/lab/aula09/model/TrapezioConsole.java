package pc2.lab.aula09.model;

import pc2.lab.aula09.view.BasicConsole;

public class TrapezioConsole extends BasicConsole {
    public Trapezio askTrapezio(){
        showMsg("Insira o valor da base maior: ");
        int baseMaior = in.nextInt();
        showMsg("Insira o valor do base menor: ");
        int baseMenor = in.nextInt();
        showMsg("Insira o valor da altura: ");
        int altura = in.nextInt();
        Trapezio trapezio = new Trapezio(baseMaior, baseMenor, altura);
        return trapezio;
    }
}
