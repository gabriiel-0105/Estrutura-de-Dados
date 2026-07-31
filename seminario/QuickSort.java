package seminario;
import java.util.Scanner;

public class QuickSort {

    public static void quickSort(int[] numeros, int inicio, int fim) {

        if (inicio < fim) {

            int pivo = separar(numeros, inicio, fim);

            //método responsável pela ordenação, menores à direita e maiores à esquerda
            quickSort(numeros, inicio, pivo - 1);
            quickSort(numeros, pivo + 1, fim);
        }
    }

    public static int separar(int[] numeros, int inicio, int fim) {

        int pivo = numeros[fim];
        int i = inicio;
        //O j percorre os números do vetor.
        for (int j = inicio; j < fim; j++) {
            //verifica se o número atual j é menor que o pivô, se for, esse número passa para a parte esquerda do vetor.
            if (numeros[j] < pivo) {

                int temp = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temp;

                i++;
            }
        }

        int temp = numeros[i];
        numeros[i] = numeros[fim];
        numeros[fim] = temp;

        return i;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números deseja inserir? ");
        int quantidade = scanner.nextInt();

        int[] numeros = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {

            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        quickSort(numeros, 0, numeros.length - 1);

        System.out.println("\nNúmeros em ordem crescente:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        scanner.close();
    }

}