package matrizes;
import java.util.Scanner;

public class Introducao {
    Scanner sc = new Scanner(System.in);

    private int[][] matriz;

    public void Matriz() {
        matriz = new int[3][3];
    }

    public void preencher() {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Digite o valor da posição [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public void imprimir() {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%3d", matriz[i][j]);
            }

            System.out.println();
        }
    }
}
