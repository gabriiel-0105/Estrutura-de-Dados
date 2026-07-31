package atividade2;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Digite um número: ");
        n = scanner.nextInt();
        if (n%2==0) {
            System.out.println("O número é par.");  
        }
        else if (n%2!=0) {
            System.out.println("O número é ímpar.");
            
        }
        //Para saber se é primo ou não.
        
    }
    
}