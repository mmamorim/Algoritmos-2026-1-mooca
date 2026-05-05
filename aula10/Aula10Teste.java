public class Aula10Teste {

    public static void main(String[] args) {

        //Produto[] produtos = {
        //        new Produto(1, "Coca-Cola", 5.5, 10),
        //        new Produto(2, "Chocolate", 3.0, 20),
        //        new Produto(3, "Outro", 5.5, 10),
        //        new Produto(4, "Algo", 3.0, 20)
        //};

        // Salvar
        //CsvUtil.salvar(produtos, "produtos.csv");

        // Ler
        Produto[] produtosLidos = CsvUtil.ler("produtos.csv", Produto.class);

        // Teste
        for (Produto p : produtosLidos) {
            System.out.println(p.nome + " - " + p.preco);
        }
    }
}
