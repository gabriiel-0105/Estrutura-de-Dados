package atividade;
import java.util.Scanner;

public class Atividade4 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double distancia, tempo, velocidadeMedia;

        System.out.println("Digite a distância percorrida em metros: ");
        distancia = scanner.nextDouble();
        System.out.println("Digite o tempo gasto em segundos: ");
        tempo = scanner.nextDouble();

        velocidadeMedia = (distancia/tempo);
        System.out.println("A velocidade média é: " + velocidadeMedia + "m/s");
          
    }
}