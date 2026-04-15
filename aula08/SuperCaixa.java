import java.util.Scanner;

public class SuperCaixa {

    static String produtos[] = { "Feijão", "Café", "Arroz 5Kg", "Snickers", "Farinha 1kg", "Coca-cola" };
    static double precos[] = { 7.5, 30.75, 20.0, 5.5, 8.0, 15.0 };

    public static void main(String[] args) {

        imprimeNomeAppVersao();
        String relatorio = "";
        int codigo = 0;
        double total = 0;

        while (codigo >= 0) {
            Screen.clear();
            System.out.println(relatorio);
            System.out.println("TOTAL DA COMPRA: R$ "+total);
            imprimeListaProdutos();
            codigo = lerCodigo();
            if (codigo >= 0) {
                int qtde = lerQtde();
                total = total + precos[codigo]*qtde;
                relatorio = relatorio + gerarItemLinha(codigo, qtde);
            }
        }

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

    public static String gerarItemLinha(int codigo, int qtde) {
        String linha = "item: (" + codigo + ") - " + produtos[codigo];
        linha = linha + " - " + qtde + " unidades \n";
        //System.out.println(linha);
        return linha;
    }

    public static int lerCodigo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite código do produto (-1 p/ sair): ");
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