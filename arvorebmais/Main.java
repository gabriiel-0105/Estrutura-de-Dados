package arvorebmais;

public class Main {

    public static void main(String[] args) {

        ArvoreBMais arvore = new ArvoreBMais();

        // Inserindo valores
        arvore.inserir(10);
        arvore.inserir(20);
        arvore.inserir(30);
        arvore.inserir(40);
        arvore.inserir(50);
        arvore.inserir(60);
        arvore.inserir(70);

        // Mostra a estrutura
        arvore.imprimirArvore();

        // Mostra as folhas encadeadas
        arvore.imprimirFolhas();

        // Testando busca
        System.out.println("Busca por 40:");

        if (arvore.buscar(40)) {
            System.out.println("Elemento encontrado!");
        } else {
            System.out.println("Elemento não encontrado!");
        }

        System.out.println();

        System.out.println("Busca por 100:");

        if (arvore.buscar(100)) {
            System.out.println("Elemento encontrado!");
        } else {
            System.out.println("Elemento não encontrado!");
        }
    }
}