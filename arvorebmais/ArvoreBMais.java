package arvorebmais;

public class ArvoreBMais {

    private NoBMais raiz;

    public ArvoreBMais() {
        raiz = new NoBMais(true);
    }

    // =========================
    // BUSCA
    // =========================

    public boolean buscar(int valor) {

        NoBMais atual = encontrarFolha(valor);

        for (int i = 0; i < atual.quantidade; i++) {
            if (atual.chaves[i] == valor) {
                return true;
            }
        }

        return false;
    }

    // =========================
    // ENCONTRAR FOLHA
    // =========================

    private NoBMais encontrarFolha(int valor) {

        NoBMais atual = raiz;

        while (!atual.folha) {

            int i = 0;

            while (i < atual.quantidade &&
                   valor >= atual.chaves[i]) {
                i++;
            }

            atual = atual.filhos[i];
        }

        return atual;
    }

    // =========================
    // INSERÇÃO
    // =========================

    public void inserir(int valor) {

        NoBMais folha = encontrarFolha(valor);

        int i = folha.quantidade - 1;

        while (i >= 0 && folha.chaves[i] > valor) {
            folha.chaves[i + 1] = folha.chaves[i];
            i--;
        }

        folha.chaves[i + 1] = valor;
        folha.quantidade++;
    // split - nó fica cheio e abre um novo nó
        if (folha.quantidade == 4) {
            dividirFolha(folha);
        }
    }

    // =========================
    // DIVISÃO DA FOLHA
    // =========================

    private void dividirFolha(NoBMais folha) {

        NoBMais novaFolha = new NoBMais(true);

        novaFolha.chaves[0] = folha.chaves[2];
        novaFolha.chaves[1] = folha.chaves[3];
        novaFolha.quantidade = 2;

        folha.quantidade = 2;

        // Liga as folhas - encadear novamente
        novaFolha.proxima = folha.proxima;
        folha.proxima = novaFolha;

        // Primeira chave da nova folha
        // será usada no nó pai
        int chavePai = novaFolha.chaves[0];

        // Se a folha era a raiz,
        // criamos uma nova raiz
        if (folha == raiz) {

            NoBMais novaRaiz = new NoBMais(false);

            novaRaiz.chaves[0] = chavePai;
            novaRaiz.quantidade = 1;

            novaRaiz.filhos[0] = folha;
            novaRaiz.filhos[1] = novaFolha;
            //raiz se torna nó e é criada uma nova raiz
            raiz = novaRaiz;

        } else {

            inserirNoPai(
                raiz,
                folha,
                novaFolha,
                chavePai
            );
        }
    }

    // =========================
    // INSERIR NO PAI
    // =========================

    private void inserirNoPai(
            NoBMais no,
            NoBMais esquerda,
            NoBMais direita,
            int chave) {

        for (int i = 0; i <= no.quantidade; i++) {

            if (no.filhos[i] == esquerda) {

                // Move os filhos
                for (int j = no.quantidade;
                     j > i;
                     j--) {

                    no.filhos[j + 1] = no.filhos[j];
                }

                // Move as chaves
                for (int j = no.quantidade - 1;
                     j >= i;
                     j--) {

                    no.chaves[j + 1] = no.chaves[j];
                }

                no.chaves[i] = chave;
                no.filhos[i + 1] = direita;

                no.quantidade++;

                return;
            }
        }

        // Procura o pai nos níveis abaixo
        for (int i = 0; i <= no.quantidade; i++) {

            if (no.filhos[i] != null) {

                inserirNoPai(
                    no.filhos[i],
                    esquerda,
                    direita,
                    chave
                );
            }
        }
    }

    // =========================
    // IMPRIMIR ÁRVORE
    // =========================

    public void imprimirArvore() {

        System.out.println("\n=== ÁRVORE B+ ===");

        imprimirNo(raiz, 0);

        System.out.println("=================\n");
    }

    private void imprimirNo(
            NoBMais no,
            int nivel) {

        for (int i = 0; i < nivel; i++) {
            System.out.print("    ");
        }

        System.out.print("[ ");

        for (int i = 0; i < no.quantidade; i++) {

            System.out.print(no.chaves[i]);

            if (i < no.quantidade - 1) {
                System.out.print(" | ");
            }
        }

        System.out.println(" ]");

        if (!no.folha) {

            for (int i = 0;
                 i <= no.quantidade;
                 i++) {

                imprimirNo(
                    no.filhos[i],
                    nivel + 1
                );
            }
        }
    }

    // =========================
    // IMPRIMIR FOLHAS
    // =========================

    public void imprimirFolhas() {

        System.out.println("\n=== FOLHAS ===");

        NoBMais atual = raiz;

        // Vai até a primeira folha
        while (!atual.folha) {
            atual = atual.filhos[0];
        }

        // Percorre as folhas
        while (atual != null) {

            System.out.print("[ ");

            for (int i = 0;
                 i < atual.quantidade;
                 i++) {

                System.out.print(atual.chaves[i]);

                if (i < atual.quantidade - 1) {
                    System.out.print(" | ");
                }
            }

            System.out.print(" ]");

            if (atual.proxima != null) {
                System.out.print(" -> ");
            }

            atual = atual.proxima;
        }

        System.out.println(" -> null");
        System.out.println("==============\n");
    }
}