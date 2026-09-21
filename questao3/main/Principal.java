package questao3.main;

import questao3.basica.Processo;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Principal {

    public static void main(String[] args) {

        Queue<Processo> fila = new LinkedList<>();

        Processo p1 = new Processo(1, "Documento 1");
        Processo p2 = new Processo(2, "Documento 2");
        Processo p3 = new Processo(3, "Documento 3");
        Processo p4 = new Processo(4, "Documento 4");

        // Adicionar
        fila.add(p1);
        fila.add(p2);
        fila.add(p3);
        fila.add(p4);

        mostrar(fila);

        // Verificar
        System.out.println("\nPrimeiro da fila:");
        System.out.println(fila.peek());

        // Remover
        System.out.println("\nRemovendo:");
        System.out.println(fila.remove());

        mostrar(fila);

        // Inverter usando uma pilha
        Stack<Processo> pilha = new Stack<>();

        while (!fila.isEmpty()) {
            pilha.push(fila.remove());
        }

        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }

        System.out.println("\nFila invertida:");

        mostrar(fila);
    }

    public static void mostrar(Queue<Processo> fila) {

        System.out.println("\n--- FILA ---");

        for (Processo processo : fila) {
            System.out.println(processo);
        }
    }
}