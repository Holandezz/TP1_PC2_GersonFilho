package pc2.lab.aula09.model;

import pc2.lab.aula09.view.BasicConsole;

public class LosangoConsole extends BasicConsole{
        public Losangulo askLosango(){
            showMsg("Insira o valor da diagonal maior: ");
            int tamanhoDmaior = in.nextInt();
            showMsg("Insira o valor da diagonal menor: ");
            int tamanhoDmenor = in.nextInt();
            Losangulo losango = new Losangulo(tamanhoDmaior,tamanhoDmenor);
            return losango;
        }
}
