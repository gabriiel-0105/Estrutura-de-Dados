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

    }

    public void inserirPorPosicao(int valor){

    }

    public void imprimirLista(){
        
    }

    
}
