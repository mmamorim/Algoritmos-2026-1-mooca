public class ListaPessoas {
    public Pessoa lista[];

    public ListaPessoas() {
        lista = CsvUtil.ler("pessoas.csv", Pessoa.class);
    }

    public void listar() {
        for (int i = 0; i < lista.length; i++) {
            lista[i].imprime();
        }
    }
}
