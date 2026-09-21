package questao1.basica;

public class Processo {
    public Processo(int pid, String conteudo) {
        this.pid = pid;
        this.conteudo = conteudo;
    }
    public Processo() {
    }
    private int pid;
    private String conteudo;
    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    
    @Override
    public String toString() {
        return "PID: " + pid + " | Conteúdo: " + conteudo;
    }

    
    
}
