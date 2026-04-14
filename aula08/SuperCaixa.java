public class SuperCaixa {

    static String produtos[] = { "Feijão", "Café", "Arroz 5Kg", "Snickers", "Farinha 1kg", "Coca-cola" };
    static double precos[] = { 7.5, 30.75, 20.0, 5.5, 8.0, 15.0 };

    public static void main(String[] args) {

        imprimeNomeAppVersao();
        imprimeListaProdutos();

    }

    public static void imprimeNomeAppVersao() {
        System.out.println("===================");
        System.out.println("+ Super Caixa 1.0 +");
        System.out.println("===================");
    }

    public static void imprimeListaProdutos() {
        System.out.println("MENU - Lista de produtos");
        System.out.println("========================");
        for(int i=0; i < produtos.length; i++) {
            System.out.println("("+i+") - "+produtos[i]+" R$ "+precos[i]);
        }
    }

}