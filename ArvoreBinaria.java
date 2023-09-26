package arvorebinariaprojeto;

public class ArvoreBinaria {
    private NoArvore raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public NoArvore getRaiz() {
        return this.raiz;
    }

    // Método de inserção
    public void inserir(int valor) {
        this.raiz = inserirRecursivo(this.raiz, valor);
    }

    private NoArvore inserirRecursivo(NoArvore atual, int valor) {
        if (atual == null) {
            return new NoArvore(valor);
        }

        if (valor < atual.getDado()) {
            atual.setEsquerdo(inserirRecursivo(atual.getEsquerdo(), valor));
        } else if (valor > atual.getDado()) {
            atual.setDireito(inserirRecursivo(atual.getDireito(), valor));
        }

        return atual;
    }

    // Métodos de exibição
    public void exibirInOrdem() {
        exibirInOrdemRecursivo(this.raiz);
        System.out.println();
    }

    private void exibirInOrdemRecursivo(NoArvore no) {
        if (no != null) {
            exibirInOrdemRecursivo(no.getEsquerdo());
            System.out.print(no.getDado() + " ");
            exibirInOrdemRecursivo(no.getDireito());
        }
    }

    public void exibirPreOrdem() {
        exibirPreOrdemRecursivo(this.raiz);
        System.out.println();
    }

    private void exibirPreOrdemRecursivo(NoArvore no) {
        if (no != null) {
            System.out.print(no.getDado() + " ");
            exibirPreOrdemRecursivo(no.getEsquerdo());
            exibirPreOrdemRecursivo(no.getDireito());
        }
    }

    public void exibirPosOrdem() {
        exibirPosOrdemRecursivo(this.raiz);
        System.out.println();
    }

    private void exibirPosOrdemRecursivo(NoArvore no) {
        if (no != null) {
            exibirPosOrdemRecursivo(no.getEsquerdo());
            exibirPosOrdemRecursivo(no.getDireito());
            System.out.print(no.getDado() + " ");
        }
    }

    // Métodos de remoção
    public void remover(int valor) {
        this.raiz = removerRecursivo(this.raiz, valor);
    }

    private NoArvore removerRecursivo(NoArvore atual, int valor) {
        if (atual == null) {
            return null;
        }

        if (valor < atual.getDado()) {
            atual.setEsquerdo(removerRecursivo(atual.getEsquerdo(), valor));
        } else if (valor > atual.getDado()) {
            atual.setDireito(removerRecursivo(atual.getDireito(), valor));
        } else {
            // Nó com apenas um filho ou sem filhos
            if (atual.getEsquerdo() == null) {
                return atual.getDireito();
            } else if (atual.getDireito() == null) {
                return atual.getEsquerdo();
            }

            // Nó com dois filhos, pegar o menor nó à direita
            atual.setDado(minValor(atual.getDireito()));

            // Remover o nó menor à direita
            atual.setDireito(removerRecursivo(atual.getDireito(), atual.getDado()));
        }
        return atual;
    }

    private int minValor(NoArvore raiz) {
        int minValor = raiz.getDado();
        while (raiz.getEsquerdo() != null) {
            minValor = raiz.getEsquerdo().getDado();
            raiz = raiz.getEsquerdo();
        }
        return minValor;
    }
}
