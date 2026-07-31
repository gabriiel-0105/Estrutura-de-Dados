package atividade2;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numero, contador = 1;
        System.out.println("Digite o número: ");
        numero = scanner.nextInt();
        System.out.println("A tabuada de " + numero + " é: ");
        while (contador<=10) {
            System.out.println(numero + " X " + contador + " = " + (contador*numero));
            contador++;   
        }
        scanner.close();

    }
    
}
