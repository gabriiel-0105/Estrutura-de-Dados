package questao1.main;

import questao1.basica.Processo;
import questao1.estrutura.Fila;

public class Principal {

    public static void main(String[] args) {

        Fila fila = new Fila(10);

        Processo p1 = new Processo(1, "Documento 1");
        Processo p2 = new Processo(2, "Documento 2");
        Processo p3 = new Processo(3, "Documento 3");
        Processo p4 = new Processo(4, "Documento 4");

        fila.adicionar(p1);
        fila.adicionar(p2);
        fila.adicionar(p3);
        fila.adicionar(p4);

        fila.mostrar();

        System.out.println("\nPrimeiro da fila:");
        System.out.println(fila.verificar());

        System.out.println("\nRemovendo:");
        System.out.println(fila.remover());

        fila.mostrar();

        System.out.println("\nInvertendo a fila...");
        fila.inverter();

        fila.mostrar();
    }
}
