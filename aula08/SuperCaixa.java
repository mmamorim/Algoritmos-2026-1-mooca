import java.util.Scanner;

public class SuperCaixa {

    static String produtos[] = { "Feijão", "Café", "Arroz 5Kg", "Snickers", "Farinha 1kg", "Coca-cola" };
    static double precos[] = { 7.5, 30.75, 20.0, 5.5, 8.0, 15.0 };

    public static void main(String[] args) {
        
        imprimeNomeAppVersao();
        imprimeListaProdutos();

        int codigo = lerCodigo();
        int qtde = lerQtde();
        imprimeItemLinha(codigo,qtde);

    }

    public static void imprimeNomeAppVersao() {
        System.out.println("===================");
        System.out.println("+ Super Caixa 1.0 +");
        System.out.println("===================");
    }

    public static void imprimeListaProdutos() {
        System.out.println("MENU - Lista de produtos");
        System.out.println("========================");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("(" + i + ") - " + produtos[i] + " R$ " + precos[i]);
        }
    }

    public static void imprimeItemLinha(int codigo, int qtde) {
        String linha = "item: (" + codigo + ") - " + produtos[codigo];
        linha = linha + " - " + qtde + " unidades";
        System.out.println(linha);
    }

    public static int lerCodigo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite código do produto: ");
        int codigo = sc.nextInt();
        return codigo;
    }

    public static int lerQtde() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite QTDE: ");
        int qtde = sc.nextInt();
        return qtde;
    }
}