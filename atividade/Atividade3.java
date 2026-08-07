package atividade;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        String nome;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Muito bem, "+ nome + ", digite a sua primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.println("Agora digite a segunda nota: ");
        nota2 = scanner.nextDouble();
        System.out.println("Para finalizarmos, digita a sua terceira nota: ");
        nota3 = scanner.nextDouble();
        media = (nota1 + nota2 + nota3)/3;
        if (media >= 7) {
            System.out.println("Muito bem, " + nome +  ", você está aprovado com a média de " + media + " pontos. PARABÉNS!");
        }
        else if (media >=5 && media <7) {
            System.out.println(nome + ", infelizmente você ficou de recuperação. Sua média foi: " + media + "pontos.");
        }
        else if (media < 5) {
            System.out.println(nome + ", você foi reprovado, e sua média foi: " + media + "pontos");
            }   
            scanner.close();
        }
        
    }