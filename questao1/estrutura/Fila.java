package questao1.estrutura;

import java.util.Stack;

import questao1.basica.Processo;

public class Fila {

    private Processo[] elementos;
    private int inicio;
    private int fim;

    public Fila(int tamanho){
        elementos = new Processo[tamanho];
        inicio = 0;
        fim = 0;

    }

    public void adicionar(Processo processo){
        if (fim==elementos.length){
            System.out.println("Fila cheia!");
            return;
        }
        elementos[fim] = processo;
        fim++;
        System.out.println("Processo adicionado.");
    }

    public Processo remover(){
        if (inicio==fim){
            System.out.println("Fila vazia.");
            return null;
        }
        Processo processo = elementos[inicio];
        inicio++;
        return processo;
    }

    public Processo verificar(){
        if (inicio==fim){
            System.out.println("Fila vazia.");
            return null;
        }
        return elementos[inicio];
    }

    public void mostrar(){
        if (inicio==fim){
            System.out.println("Fila vazia.");
            return;
        }
        System.out.println("     FILA     ");
        for(int i = 0;i<fim; i++){
            System.out.println(elementos[i]);
        }
    }

    public void inverter(){
        Stack<Processo> pilha = new Stack<>();
        while (inicio<fim){
            pilha.push(elementos[inicio]);
            inicio++;

        }
        inicio=0;
        while (!pilha.empty()) {
            elementos[inicio] = pilha.pop();
            inicio++;
            
        }
        fim = inicio;
        System.out.println("Fila invertida");
    }
    
}
