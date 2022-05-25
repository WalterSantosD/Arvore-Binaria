public class NoDaArvore {
    private int valor;
    private NoDaArvore esquerda;
    private NoDaArvore direita;

    public NoDaArvore(int valor, NoDaArvore esquerda, NoDaArvore direita) {
        this.valor = valor;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public void imprirPreOrdem(NoDaArvore n) {
        System.out.print(n.valor + " ");

        if (n.esquerda != null) {
            imprirPreOrdem(n.esquerda);
        }

        if (n.direita != null) {
            imprirPreOrdem(n.direita);
        }
    }

    public void imprirEmOrdem(NoDaArvore n) {

        if (n.esquerda != null) {
            imprirEmOrdem(n.esquerda);
        }
        System.out.print(n.valor + " ");
        if (n.direita != null) {
            imprirEmOrdem(n.direita);
        }
    }
    
    public void imprirPosOrdem(NoDaArvore n) {
        

        if (n.esquerda != null) {
            imprirEmOrdem(n.esquerda);
        }
        
        if (n.direita != null) {
            imprirEmOrdem(n.direita);
        }
        System.out.print(n.valor+" ");   
    }
}
