package pc2.lab.aula09.view;
import pc2.lab.aula09.model.enums.Enum2;


public class Menu2 extends BasicConsole {

    public Enum2 subMenu() {
        showMsg("Digite uma opção \n" +
                "1 - Novo\n" +
                "2 - Editar\n" +
                "3 - Listar\n" +
                "4 - Mostrar\n" +
                "5 - Excluir\n" +
                "6 - Voltar\n");

        String option = in.next();

        switch (option) {
            case "1":
                return Enum2.NOVO;
            case "2":
                return Enum2.EDITAR;
            case "3":
                return Enum2.LISTAR;
            case "4":
                return Enum2.MOSTRAR;
            case "5":
                return Enum2.EXCLUIR;
            case "6":
                return Enum2.VOLTAR;
            default:
                return Enum2.VOLTAR;
        }
    }
}