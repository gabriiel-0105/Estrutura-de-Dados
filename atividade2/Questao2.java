package atividade2;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, resultado = 0;
        char op;
        System.out.println("Digite o primeiro número: ");
        n1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextInt();
        System.out.println("Digite a operação que você quer: +, -, * ou /");
        op = scanner.next().charAt(0);
        if (op == '+') {
            resultado = n1+n2;
            
        }
        else if (op == '-') {
            resultado = n1-n2;
            
        }
        else if (op == '*') {
            resultado = n1*n2;
            
        }
        else if (op == '/') {
            resultado = n1/n2;
            
        }
        else {
            System.out.println("Operação inválida.");
        }
        System.out.println("O resultado da operação escolhida entre os dois números é: " + resultado);
        scanner.close();
        
    }
    
}
