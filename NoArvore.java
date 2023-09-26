package arvorebinariaprojeto;

public class NoArvore {
    private int dado;
    private NoArvore esquerdo;
    private NoArvore direito;

    public NoArvore(int dado) {
        this.dado = dado;
        this.esquerdo = null;
        this.direito = null;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NoArvore getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(NoArvore esquerdo) {
        this.esquerdo = esquerdo;
    }

    public NoArvore getDireito() {
        return direito;
    }

    public void setDireito(NoArvore direito) {
        this.direito = direito;
    }
}
