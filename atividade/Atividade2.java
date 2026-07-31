package atividade;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
     int idade;
     int anoNascimento;
     int anoAtual;
     String nome;

     System.out.println("Olá, qual o seu nome? ");
     nome = scanner.nextLine();

     System.out.println(nome +", em que ano estamos? ");
     anoAtual = scanner.nextInt();

     System.out.println("Em que ano você nasceu? ");
     anoNascimento = scanner.nextInt();

     idade = (anoAtual - anoNascimento);
     System.out.println(nome + ", você vai fazer " + idade + " anos neste ano.");

     scanner.close();

    }

   
}
