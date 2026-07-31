package banco;

public class CadastrarConta {

    private Conta[] contas = new Conta[3];
    int totalDeElementos = 0;

    public void adicionarConta(Conta conta) {

        if (totalDeElementos == contas.length) {
            aumentarVetor();
        }

        contas[totalDeElementos] = conta;
        totalDeElementos++;
    }

    public void listarConta() {
        for (int i = 0; i < totalDeElementos; i++) {
            System.out.println(contas[i]);
            System.out.println("==========");
        }
    }

    public void procurarConta(String nome) {
        for (int i = 0; i < totalDeElementos; i++) {

            if (contas[i].getNome().equalsIgnoreCase(nome)) {

                System.out.println("Conta encontrada!");
                System.out.println(contas[i]);
                System.out.println("==========");
                return;
            }
        }

        System.out.println("Conta não encontrada.");
    }

    public void adicionarPorPosicao(Conta conta, int posicao) {

        if (posicao < 0 || posicao > totalDeElementos) {
            System.out.println("Posição inválida!");
            return;
        }

        if (totalDeElementos == contas.length) {
            aumentarVetor();
        }

        for (int i = totalDeElementos - 1; i >= posicao; i--) {
            contas[i + 1] = contas[i];
        }

        contas[posicao] = conta;
        totalDeElementos++;

        System.out.println("Conta adicionada com sucesso!");
    }

    public void removerPorPosicao(int posicao) {

        if (posicao < 0 || posicao >= totalDeElementos) {
            System.out.println("A posição é inválida.");
            return;
        }

        for (int i = posicao; i < totalDeElementos - 1; i++) {
            contas[i] = contas[i + 1];
        }

        contas[totalDeElementos - 1] = null;
        totalDeElementos--;

        System.out.println("Conta removida com sucesso!");
    }

    private void aumentarVetor() {

        Conta[] vetorNovo = new Conta[contas.length * 2];

        System.arraycopy(contas, 0, vetorNovo, 0, contas.length);

        contas = vetorNovo;

        System.out.println("Vetor aumentado para " + contas.length + " posições.");
    }

    public void imprimirVetor() {

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < totalDeElementos; i++) {

            sb.append(contas[i]);
            sb.append("====================\n");
        }

        System.out.println(sb.toString());
    }
}