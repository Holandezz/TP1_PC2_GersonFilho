package pc2.lab.aula09.model;

import pc2.lab.aula07.BasicConsole;

public class TrianguloConsole extends BasicConsole{
        public Triangulo askTriangulo(){
            showMsg("Insira o valor do primeiro lado: ");
            int lado1 = in.nextInt();
            showMsg("Insira o valor do segundo lado: ");
            int lado2 = in.nextInt();
            showMsg("Insira o valor do terceiro lado: ");
            int lado3 = in.nextInt();
            Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
            return triangulo;
        }
}
