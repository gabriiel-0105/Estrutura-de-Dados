package revisao;

import java.util.Scanner;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {

        String nomes[] = new String[3];
        int i;
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < nomes.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = scanner.nextLine();
        }
        Arrays.sort(nomes);
        System.out.println("Nomes em ordem alfabética: ");
        for (i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        scanner.close();
    }
}
