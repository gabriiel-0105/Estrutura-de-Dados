package atividade_28_09;

import java.util.Scanner;
import java.util.Stack;

public class Questao2 {
      public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Stack<Character> pilha = new Stack<Character>();

        System.out.print("Digite uma palavra: ");
        String palavra = entrada.nextLine();

        // Colocando cada caractere na pilha
        for (int i = 0; i < palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
        }

        String invertida = "";

        while (!pilha.isEmpty()) {
            invertida = invertida + pilha.pop();
        }

        if (palavra.equals(invertida)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo!");
        }

        entrada.close();
    }
    
}
