package arvorebmais;

public class NoBMais {

    int[] chaves = new int[4];
    NoBMais[] filhos = new NoBMais[5];
    // variáveis
    int quantidade;
    boolean folha;

    NoBMais proxima;
    // construtor
    public NoBMais(boolean folha) {
        this.folha = folha;
        this.quantidade = 0;
    }
}