public class ListaPessoas {
    public Pessoa lista[];

    public ListaPessoas() {
        lista = CsvUtil.ler("pessoas.csv", Pessoa.class);
    }

    public void adicionar(Pessoa item) {
        Pessoa listaNova[] = new Pessoa[lista.length + 1];
        for (int i = 0; i < lista.length; i++) {
            listaNova[i] = lista[i];
        }
        listaNova[lista.length] = item;
        CsvUtil.salvar(listaNova, "pessoas.csv");
    }

    public int buscar(int codigo) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].codigo == codigo) {
                return i;
            }
        }
        return -1;
    }

    public void excluir(int codigo) {
        int posItem = buscar(codigo);
        if (posItem == -1) {
            System.out.println("Codigo não encontrado: " + codigo);
        } else {
            Pessoa listaNova[] = new Pessoa[lista.length - 1];
            int pos = 0;
            for (int i = 0; i < lista.length; i++) {
                if(i!=posItem) {
                    listaNova[pos] = lista[i];
                    pos++;
                }
            }
            CsvUtil.salvar(listaNova, "pessoas.csv");
            lista = listaNova;
        }
    }

    public void listar() {
        for (int i = 0; i < lista.length; i++) {
            lista[i].imprime();
        }
    }
}
