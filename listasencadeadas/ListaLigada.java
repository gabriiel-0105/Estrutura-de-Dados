package listasencadeadas;

public class ListaLigada {
    public ListaLigada(Celula cabeca, Celula cauda) {
        this.cabeca = cabeca;
        this.cauda = cauda;
    }
    public ListaLigada() {
    }
    private Celula cabeca;
    private Celula cauda;
    private int tamanho;
    
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public Celula getCabeca() {
        return cabeca;
    }
    public void setCabeca(Celula cabeca) {
        this.cabeca = cabeca;
    }
    public Celula getCauda() {
        return cauda;
    }
    public void setCauda(Celula cauda) {
        this.cauda = cauda;
    }
    

    
    
    public void inserir(int valor){
        Celula novaCelula = new Celula(valor);

        if (cabeca==null){
            cabeca = novaCelula;
            cauda = novaCelula;

        } else {
            cauda.setProxima(novaCelula);
            cauda = novaCelula;

        }
        this.tamanho++;


    }
    public void inserirNoComeco(int valor){
        Celula novaCelula = new Celula(valor);

        if (cabeca==null){
            cabeca = novaCelula;
            cauda = novaCelula;

        } else{
            novaCelula.setProxima(cabeca);
            cabeca = novaCelula;
        }
        this.tamanho++;

    }

    public void inserirPorPosicao(int valor, int posicao){
        Celula novaCelula = new Celula(valor);

        if (posicao == 0){
            inserir(valor);
        }else{
            Celula prx = cabeca;
            for(int i=0;i<posicao-1;i++ ){
                prx = prx.getProxima();
            }
            novaCelula.setProxima(prx.getProxima());
            prx.setProxima(novaCelula);
        }
    }

    public void imprimirLista(){
        
    }

    
}
