package revisao;

import java.util.Scanner;
import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[] = new int[5];
        int resultado;
        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            num[i] = scanner.nextInt();
        }
        System.out.println("==Elementos do vetor:==");

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        Calc calc = new Calc();
        resultado = calc.somar(num);

        System.out.println("Soma dos números do vetor: " + resultado);

        scanner.close();}}