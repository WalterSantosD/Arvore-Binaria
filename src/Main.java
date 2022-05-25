public class Main {
    public static void main(String[] args) throws Exception {
        NoDaArvore no = new NoDaArvore(10, new NoDaArvore(15, null, null),
                new NoDaArvore(50, new NoDaArvore(20, null, null), null));

        System.out.println("Pré ordem");
        no.imprirPreOrdem(no);
        System.out.println(" ");

        System.out.println("Em ordem");
        no.imprirEmOrdem(no);
        System.out.println(" ");

        System.out.println("Pós ordem");
        no.imprirPosOrdem(no);
        System.out.println(" ");
    }
}
