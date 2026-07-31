package banco;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CadastrarConta cadastro = new CadastrarConta();
        Conta c1 = new Conta("Gabriel", 5000);
        Conta c2 = new Conta("Xande", 2000);
        Conta c3 = new Conta("Felps", 8000);
        Conta c4 = new Conta("Joao", 6000);

        cadastro.adicionarConta(c1);
        cadastro.adicionarConta(c2);
        cadastro.adicionarConta(c3);
        cadastro.adicionarConta(c4);



        System.out.println("\nIMPRIMINDO COM STRINGBUFFER");
        cadastro.imprimirVetor();
        

        scanner.close();
    }
}