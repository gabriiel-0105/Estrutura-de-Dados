package atividade_28_09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Questao1 {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<String>();
        Stack<String> pilha = new Stack<String>();

        fila.add("A");
        fila.add("B");
        fila.add("C");
        fila.add("D");
        fila.add("E");

        System.out.println("Fila original: " + fila);

        // passando os elementos da fila para a pilha
        while (!fila.isEmpty()) {
            pilha.push(fila.remove());
        }

        // passando os elementos da pilha de volta para a fila
        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }

        System.out.println("Fila invertida: " + fila);
    }
    
}
