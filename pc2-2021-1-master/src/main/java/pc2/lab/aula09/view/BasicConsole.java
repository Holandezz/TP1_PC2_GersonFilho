package pc2.lab.aula09.view;

import pc2.lab.aula09.model.enums.OpcoesMenuEnum;

import java.util.Scanner;

public class BasicConsole {

    protected Scanner in;

    public BasicConsole(){
        in = new Scanner(System.in);
    }

    public String askStr(String msg){
        return in.next();
    }
    public void showLnMsg(String msg){
        System.out.println(msg);
    }


    public void showMsg(String msg){
        System.out.print(msg);
    }

    public int askInt(String msg){
        showMsg(msg);
        return in.nextInt();
    }


    public int askInt(){
        return in.nextInt();
    }

    public boolean hasNextInt(){
        return in.hasNextInt();
    }

    public OpcoesMenuEnum askOpcaoMenuPrincial(){
        //Loop até entregar uma opção válida
        showMsg("Digite uma opção \n" +
                "1 - Criar Quadrado\n" +
                "2 - Criar Retangulo\n" +
                "3 - Criar Triângulo\n" +
                "4 - Criar Losango\n" +
                "5 - Criar Trapézio\n" +
                "6 - Criar Círculo\n" +
                "7 - Criar Ponto\n" +
                "8 - Criar Reta\n" +
                "A - Apagar Item\n" +
                "L - Listar\n" +
                "D - Desenhar\n" +
                "X - Sair\n");

        String opcao = in.next();

        switch (opcao){
            case "1":
                return OpcoesMenuEnum.QUADRADO;
            case "2":
                return OpcoesMenuEnum.RETANGULO;
            case "3":
                return OpcoesMenuEnum.TRIANGULO;
            case "4":
                return OpcoesMenuEnum.LOSANGO;
            case "5":
                return OpcoesMenuEnum.TRAPEZIO;
            case "6":
                return OpcoesMenuEnum.CIRCULO;
            case "7":
                return OpcoesMenuEnum.PONTO;
            case "8":
                return OpcoesMenuEnum.RETA;
            case "X":
                return OpcoesMenuEnum.SAIR;
            case "A":
                return OpcoesMenuEnum.APAGAR;
            case "L":
                return OpcoesMenuEnum.LISTAR;
            case "D":
                return OpcoesMenuEnum.DESENHAR;

            default:
                showMsg("A opção digitada não é válida.");
                return OpcoesMenuEnum.ERRO;

        }
    }

}
