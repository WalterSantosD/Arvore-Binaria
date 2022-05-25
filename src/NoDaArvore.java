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
        System.out.print(n.valor+" ");

        if (n.esquerda != null) {
            imprirPreOrdem(n.esquerda);
        }
        
        if (n.direita != null) {
            imprirPreOrdem(n.direita);
        }
        
          
    }
}
