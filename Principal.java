package arvorebinariaprojeto;

public class Principal {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(4);
        arvore.inserir(1);
        arvore.inserir(6);
        arvore.inserir(3);
        arvore.inserir(5);
        arvore.inserir(7);
        arvore.inserir(2);

        System.out.println("Em ordem:");
        arvore.exibirInOrdem();

        System.out.println("Pre-ordem:");
        arvore.exibirPreOrdem();

        System.out.println("Pos-ordem:");
        arvore.exibirPosOrdem();

        System.out.println("Apos remocao do valor 5:");
        arvore.remover(5);
        System.out.println("Em ordem:");
        arvore.exibirInOrdem();
    }
}

