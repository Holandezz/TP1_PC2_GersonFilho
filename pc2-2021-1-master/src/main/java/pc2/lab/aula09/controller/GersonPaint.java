package pc2.lab.aula09.controller;

import pc2.lab.aula09.model.*;
import pc2.lab.aula09.model.enums.OpcoesMenuEnum;
import pc2.lab.aula09.model.enums.RetaConsole;
import pc2.lab.aula09.view.BasicConsole;
import pc2.lab.aula09.view.DesenhoBoard;

import java.util.ArrayList;

public class GersonPaint {
    private QuadradoConsole quadTela = new QuadradoConsole();
    private TrianguloConsole trianguloTela = new TrianguloConsole();
    private CirculoConsole circuloTela = new CirculoConsole();
    private LosangoConsole losangoTela = new LosangoConsole();
    private RetanguloConsole retanguloTela = new RetanguloConsole();
    private PontoConsole pontoTela = new PontoConsole();
    private RetaConsole retaTela = new RetaConsole();
    private TrapezioConsole trapTela = new TrapezioConsole();

    private FiguraGeometrica[] vetor;
    private BasicConsole tela;
    private DesenhoBoard canvas;

    public GersonPaint(){
        vetor= new FiguraGeometrica[10];
        tela = new BasicConsole();
        canvas = new DesenhoBoard();
    }

    public void mostrarMenu() {
        OpcoesMenuEnum opcao = OpcoesMenuEnum.LISTAR;

        do {
            opcao = tela.askOpcaoMenuPrincial();

            tela.showMsg("escolhi: " + opcao + "\n\n");

            switch (opcao) {
                case QUADRADO:
                    Quadrado quad = quadTela.askQuadrado();
                    insertFiguraGeométrica(quad);
                    break;
                case RETANGULO:
                    Retangulo retangulo = retanguloTela.askRetangulo();
                    insertFiguraGeométrica(retangulo);
                    break;
                case TRIANGULO:
                    Triangulo triangulo = trianguloTela.askTriangulo();
                    insertFiguraGeométrica(triangulo);
                    break;
                case TRAPEZIO:
                    Trapezio trapezio = trapTela.askTrapezio();
                    insertFiguraGeométrica(trapezio);
                    break;
                case RETA:
                    Reta reta = retaTela.askReta();
                    insertFiguraGeométrica(reta);
                    break;
                case LOSANGO:
                    Losangulo losango = losangoTela.askLosango();
                    insertFiguraGeométrica(losango);
                    break;
                case PONTO:
                    Ponto ponto = pontoTela.askPonto();
                    insertFiguraGeométrica(ponto);
                    break;
                case CIRCULO:
                    Circulo circulo = circuloTela.askCirculo();
                    insertFiguraGeométrica(circulo);
                    break;
                case LISTAR:
                    listar();
                    break;
                case DESENHAR:
                    canvas.desenhar(vetor);
                    break;
                case SAIR:
                    break;
                case APAGAR:
                    apagar();
                    break;
                default:
            }


        } while (opcao != OpcoesMenuEnum.SAIR);
    }
    public void apagar(){
        int apagar;
        listar();
        tela.showMsg("Qual a posição da figura que deseja apagar? ");
        apagar = tela.askInt()-1;
        vetor[apagar] = null;
    }
        public void listar(){
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] != null) {
                    System.out.println((i+1) + " - " +vetor[i].toString());
                }
            }
        }
        public boolean insertFiguraGeométrica (FiguraGeometrica fig){
            for (int i = 0; i < vetor.length; i++) {
                if (i == vetor.length - 1 && vetor[i] != null) {
                    tela.showMsg("O vetor está cheio.");
                    break;
                }
                if (vetor[i] == null) {
                    vetor[i] = fig;
                    break;
                }
            }
            return true;
        }

    }