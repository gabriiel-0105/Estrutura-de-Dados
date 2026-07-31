package revisao;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int[] vet1 = new int[3];
        int[] vet2 = new int[3];

        int i, j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Preenchendo o vetor 1: ");
        for (i = 0; i < vet1.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            vet1[i] = scanner.nextInt();
        }
        System.out.println("\n");
        System.out.println("Preenchendo o vetor 2: ");
        for (j = 0; j < vet2.length; j++) {
            System.out.println("Digite o " + (j + 1) + "º número: ");
            vet2[j] = scanner.nextInt();
        }
        System.out.println("\n");
        System.out.println("Vetor concatenado: ");
        System.out.println(Arrays.toString(Juntar.juntarVetor(vet1, vet2)));

        scanner.close();

    }

}