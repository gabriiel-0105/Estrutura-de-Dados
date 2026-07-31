package seminario;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Quantos números deseja inserir? ");
	        int quantidade = scanner.nextInt();

	        int[] numeros = new int[quantidade];

	        for (int i = 0; i < quantidade; i++) {

	            System.out.print("Digite o número " + (i + 1) + ": ");
	            numeros[i] = scanner.nextInt();
	        }
            //controla quantas vezes o vetor será percorrido
	        for (int i = 0; i < numeros.length - 1; i++) {
                //percorre os elementos do vetor comparando números vizinhos
	            for (int j = 0; j < numeros.length - 1 - i; j++) {
                    /*verifica se dois números vizinhos estão fora de ordem.
                     Se estiverem, o algoritmo realiza a troca usando a variável temporária temp */
	                if (numeros[j] > numeros[j + 1]) {

	                    int temp = numeros[j];
	                    numeros[j] = numeros[j + 1];
	                    numeros[j + 1] = temp;
	                }
	            }
	        }

	        System.out.println("\nNúmeros em ordem crescente:");
            /*Para cada elemento do vetor numeros,
            guarde o valor na variável numero */
	        for (int numero : numeros) {
	            System.out.print(numero + " ");
	        }

	        scanner.close();
	    }

	}